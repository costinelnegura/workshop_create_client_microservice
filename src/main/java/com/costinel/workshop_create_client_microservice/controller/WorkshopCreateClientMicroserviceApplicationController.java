package com.costinel.workshop_create_client_microservice.controller;

import com.costinel.repo.UserRepo;
import com.costinel.workshop_create_client_microservice.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkshopCreateClientMicroserviceApplicationController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/test")
    public String getString(){
        return "string test";
    }

    @GetMapping(value = "/clients")
    public List<Client> getAllClients(){
        return userRepo.findAll();
    }

}
