package com.costinel.workshop_create_client_microservice.repo;

import com.costinel.workshop_create_client_microservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepo extends JpaRepository<Client, Long> {
}
