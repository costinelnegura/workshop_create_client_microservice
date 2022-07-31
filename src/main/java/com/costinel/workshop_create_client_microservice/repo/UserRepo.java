package com.costinel.workshop_create_client_microservice.repo;

import com.costinel.workshop_create_client_microservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Client, Long> {
}
