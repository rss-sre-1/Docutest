package com.revature.docutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocutestApplication {

    public static void main(String[] args) {
        System.out.println(System.getenv("postgres_username"));
        System.out.println(System.getenv("postgres_pw"));
        System.out.println(System.getenv("db_url"));
        SpringApplication.run(DocutestApplication.class, args);
    }

}
