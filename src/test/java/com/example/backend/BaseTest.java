package com.example.backend;

import org.testcontainers.containers.PostgreSQLContainer;

public abstract class BaseTest {

    static PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:latest")
            .withDatabaseName("reddit-db")
            .withUsername("user")
            .withPassword("pass")
            .withReuse(true);

    static {
        container.start();
    }
}
