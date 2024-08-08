package br.com.vx.microservices.kafka.venda.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/* Classe responsável pelo produtor, ele vai produzir registros
que vão ser postados no tópico */
@Configuration
public class ProducerKafkaConfig {


    /* Basicamente estamos utilizando o produce factory que vem do módulo do kafka
    * do spring para criar um objeto do tipo producer, configurando como ele deve
    * construir uma instância do nosso producer, para quando formos utilizar o producer ele construir da
    * forma correta*/

    @Bean
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        //  Define o endereço do broker Kafka (localhost:9092).
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // Define o serializador para a chave das mensagens (StringSerializer).
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        // Define o serializador para o valor das mensagens (StringSerializer).
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    /* Bean KafkaTemplate: cria e configura um template que é utilizado
    para enviar mensagens para o Kafka */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

}
