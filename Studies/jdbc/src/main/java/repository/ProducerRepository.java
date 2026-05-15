package repository;

import conn.ConnectionFactory;
import dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {

    public static void save(Producer producer){

       String sql = "INSERT INTO teste.producer (name) VALUES ('One Piece');";

       try(Connection conn = ConnectionFactory.getConnection();
           Statement stmt = conn.createStatement()) {
               stmt.executeUpdate(sql);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }

    }
}
