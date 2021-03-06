# Ad-Streams - "Every click matters"
Repository for my data engineering project done during Insight fellows program

## tl;dr

 * [Slides](http://www.bit.ly/ads1989)
 * [Live Demo](http://www.adtstreams.info)
 
 ## Index

1. [Introduction](README.md#1-introduction)
 * 1.1 [Project Details](README.md#11-project-details)
2. [The Pipeline](README.md#2-the-pipeline)
 * 2.0 [Avro Schema](README.md#20-avro-schema)
 * 2.1 [Kafka Ingestion](README.md#21-kafka-ingestion)
 * 2.2 [Kafka Streams Application](README.md#22-kafka-streams-application)
 * 2.3 [Cassandra](README.md#23-cassandra)

## 1. Introduction

Google recently announced a new product called digital attribution which called for data-driven attribution and considering all responses of a user instead of just the last click.

Digital marketing advertisements are continuously affecting target users to varying degrees and these users in turn may respond by showing interest through clicking, researching the event, looking for deals or buying the product. All of this is happening simultaneously for all users. Each of these users can then be thought to be in a different position on the conversion funnel - henceforth referred to as propensity for conversion or simply propensity .Based on users current propensity the most productive next digital marketing move can be highly customized and optimized for that particular user. This type of highly reactive digital marketing platform would require continuously evaluating each user's current propensity.


### 1.1 Project Details

This project demonstrates both the engineering, business and human aspects of solving this problem. A logistic regression scoring based approach to computing propensity score based on user history, implemented this approach on a streaming infrastructure, separates the business logic from the details on underlying streaming infrastructure through schema formats The overall end to end technique demonstrated here could be applied in a straightforward manner to any of the other specific problem involving digital marketing analytics.


For this project , I am considering four kinds of user events - clicks(CL) , impressions(IM) , paid search(PS) and  past conversions(CN). As shown in the picture the idea is to sequence the user stream though a  data streaming paradigm. The specific solution for continuous propensity scoring is based on the notion of a sequence of digital marketing treatments and user actions being continuously maintained and providing the based data on which a number of features are then computed based on the type of the event and the time elapsed since the event happened.

 
![User activity for sequencing](https://github.com/mars137/Insight-project/blob/master/images/Sequencing.png)



Below image shows the feature based on impression events.



![Feature engineering](https://github.com/mars137/Insight-project/blob/master/images/feature_engineering_1.png)



All features follow different variation of this template of type of event and time based aggregation. These features are then fed to a logistic regression scoring model to compute the propensity score. Below image shows the features based on all events for feeding to logistic scoring scoring model.


![Feature engineering](https://github.com/mars137/Insight-project/blob/master/images/feature_engineering_2.png)


The entire pipeline of gathering sequence to computation of features to computation of propensity score is built on a streaming infrastructure of Kafka as storage and messaging layer, kafka-streams for business logic processing layer, avro as schema and data representation, serializing and deserializing format, Cassandra  as the distributed columnar database to store propensity over time and python  flask as the front end for visualization. In the pipeline data in motion is depicted through pipes and data at rest (cassandra sink) is depicted by a rectangles. 


## 2. The Pipeline


![Pipeline](https://github.com/mars137/Insight-project/blob/master/images/pipeline.png)


The data at rest a.k.a table requirement (Cassandra), say at the front end data presentation layer and table creation(KTable) when data is in motion is achieved through interpreting kafka streaming message queue as a change log and a table as a materialized view on this changelog. This cleanly resolves any contradiction between a continuous flowing stream of data and "at rest" batch processed table of data. 

### 2.0 Avro Schema 

There are two types of Avro schemas in play:

 * the schema for the user events for clicks, impressions, paid searches and past conversions
 * the schema for storing the continous user propensity with respect to timw
 
Through Avro schema formats , I have demonstrated that it is possible to separate out the implementation of the business logic from the details of streaming infrastructure. Avro is robust to schema changes and additional business logic computation can be developed and composed by incrementing the existing solution.

Both schemas were used to generate the Java Objects that are used for schema-specific serialization and deserialization of the event byte-stream flowing through Kafka producer and Kafka streams.

### 2.1 Kafka Ingestion

There are two types of streams for ingesting data through Kafka
  - Marketing Producer which simulates user events for Clicks (CL), Impressions (IM) and Paid Search (PS)
  - Conversion Producer which simlualates user events for user Past Conversions (CN) 
  
 The Avro schema for the events stream can be found [here](https://github.com/mars137/Insight-project/blob/master/kafka-producer/src/main/avro/Event.avsc)
 
 The Kafka producer module can be accessed from [here](https://github.com/mars137/Insight-project/tree/master/kafka-producer) 
 
 ### 2.1.1 Producer Application
    [Marketing](https://github.com/mars137/Insight-project/blob/master/kafka-producer/src/main/java/com/atif/kafka/Producer/MarketingProducer.java) 
    [Conversion](https://github.com/mars137/Insight-project/blob/master/kafka-producer/src/main/java/com/atif/kafka/Producer/ConversionProducer.java)
    
 ### 2.2 Kafka Streams Application

The module for streams application can be found  [here](https://github.com/mars137/Insight-project/tree/master/kafka-streams-application)
    It contains two main clasess 
    - [Sequence Transform](https://github.com/mars137/Insight-project/blob/master/kafka-streams-application/src/main/java/com/atif/kafka/streams/SequenceTransform.java)
    - [KafkaStreamsApplication](https://github.com/mars137/Insight-project/blob/master/kafka-streams-application/src/main/java/com/atif/kafka/streams/KafkaStreamsApplication.java)   
    
There are three streams in this application. 

 - Two streams coming in from the Kafka producer( Marketing and Conversion)
 - Joined stream made from joining Marketing and Conversion events
 - Avro schema for the resulting joined stream can be found [here](https://github.com/mars137/Insight-project/blob/master/kafka-streams-application/src/main/avro/Propensity.avsc)
 - Aggregations and sequencing is done in Kafka streams for a particular user id
 
###  2.3 Cassandra

Database connection module can be found [here](https://github.com/mars137/Insight-project/tree/master/kafka-streams-application/src/main/java/com/atif/kafka/DatabaseConnect)

The CassandraConnect class from DatabaseConnect module is used for connection in KafkaStreamsApplication class.Data from the new joined stream is serialized through Avro and sinked to Cassandra through JSON format.
 
 


        
    


 
