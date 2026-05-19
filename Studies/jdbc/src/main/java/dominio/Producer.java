package dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class Producer {

    Integer id;
    String name;

//*Utilizando o padrão Builder

//    public static final class ProducerBuilder {
//
//        private Integer id;
//        private String name;
//
//        private ProducerBuilder(){
//
//        }
//
//        public static ProducerBuilder builder(){
//            return new ProducerBuilder();
//        }
//
//        public ProducerBuilder id (Integer id){
//            this.id = id;
//            return this;
//        }
//
//        public ProducerBuilder name (String name){
//            this.name = name;
//            return this;
//
//        }
//
//        public Producer build() {
//            Producer producer = new Producer();
//            producer.name = this.name;
//            producer.id = this.id;
//            return producer;
//        }
//
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Producer producer = (Producer) o;
//        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }

}
