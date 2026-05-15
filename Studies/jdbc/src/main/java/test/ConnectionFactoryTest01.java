package test;

import conn.ConnectionFactory;
import dominio.Producer;
import repository.ProducerRepository;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        Producer producer = Producer.ProducerBuilder.builder().name("SEI LA").build();
        ProducerRepository.save(producer);

    }

}
