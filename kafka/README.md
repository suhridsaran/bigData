Please refer https://suuhrid.wixsite.com/bigdata/kafka for kafka installation and concept


Start kafka and zookeper server:

bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.propertie

 
Start the producer:
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic HelloKafkaTopic


Start the consumer:
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic HelloKafkaTopic --from-beginning
