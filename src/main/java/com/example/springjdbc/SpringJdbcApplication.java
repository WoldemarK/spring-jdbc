package com.example.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.sql.SQLException;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(SpringJdbcApplication.class, args);


    }

}
