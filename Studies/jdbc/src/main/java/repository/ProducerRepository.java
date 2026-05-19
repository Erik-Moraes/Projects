package repository;

import conn.ConnectionFactory;
import dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer){

       String sql = "INSERT INTO teste.producer (name) VALUES ('%s');".formatted(producer.getName());

       try(Connection conn = ConnectionFactory.getConnection();
           Statement stmt = conn.createStatement()) {
               int rowsAffected = stmt.executeUpdate(sql);
           log.warn("Inserted producer `{}` in the database, rows affected '{}'", producer.getName(), rowsAffected);

       } catch (SQLException e) {
           log.error("Error while trying to insert producer '{}' ", producer.getName(), e);
       }
       }

        public static void delete(int id) {

            String sql = "DELETE FROM teste.producer WHERE id = %d;".formatted(id);

            try (Connection conn = ConnectionFactory.getConnection();
                 Statement stmt = conn.createStatement()) {
                int rowsAffected = stmt.executeUpdate(sql);
                log.warn("Deleted producer `{}` in the database, rows affected '{}'", id, rowsAffected);

            } catch (SQLException e) {
                log.error("Error while trying to delete producer '{}' ", id, e);
            }
        }

        public static void update(Producer producer){

                String sql = "UPDATE teste.producer SET name = ('%s') WHERE id = %d;".formatted(producer.getName(), producer.getId());

                try(Connection conn = ConnectionFactory.getConnection();
                    Statement stmt = conn.createStatement()) {
                    int rowsAffected = stmt.executeUpdate(sql);
                    log.warn("Updated producer `{}` in the database, rows affected '{}'", producer.getId(), rowsAffected);

                } catch (SQLException e) {
                    log.error("Error while trying to delete producer '{}' ", producer.getId(), e);
                }


        }
}
