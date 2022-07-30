package com.costinel.workshop_create_client_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.costinel.workshop_create_client_microservice.repo")
public class WorkshopCreateClientMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopCreateClientMicroserviceApplication.class, args);
    }

}
