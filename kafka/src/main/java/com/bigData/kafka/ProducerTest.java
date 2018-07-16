package com.bigData.kafka;


import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

 
public class ProducerTest {
 
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    Producer<String, String> producer = null;
    try {
      producer = new KafkaProducer<>(props);
      for (int i = 1; i <= 5; i++) {
        String msg = "Message " + i;
        producer.send(new ProducerRecord<String, String>("HelloKafkaTopic", msg));
        System.out.println("Sent:" + msg);
      }
    } catch (Exception e) {
      e.printStackTrace();
 
    } finally {
      producer.close();
    }
 
  }
 
}
