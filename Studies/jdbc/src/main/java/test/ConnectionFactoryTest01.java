package test;

import conn.ConnectionFactory;
import dominio.Producer;
import repository.ProducerRepository;
import service.ProducerService;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        Producer producer = Producer.builder().name("Studio Ghibli").build();
        Producer producerToUpdate = Producer.builder().id(2).name("Studio MAPPA").build();
//
//        ProducerRepository.save(producer);

//        ProducerService.delete(3);

        ProducerService.update(producerToUpdate);



    }

}
