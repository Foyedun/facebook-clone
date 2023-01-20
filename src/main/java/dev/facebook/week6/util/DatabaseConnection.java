package dev.facebook.week6.util;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public enum DatabaseConnection {
    INSTANCE;

    public DataSource getDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/fabulous?serverTimezone=UTC");
        dataSource.setUsername("fab");
        dataSource.setPassword("fab");
        return dataSource;
    }

    public boolean isConnectionValid() {
        DataSource dataSource = getDataSource();

        try(Connection connection = dataSource.getConnection()){
            return connection.isValid(0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return false;
    }
}
