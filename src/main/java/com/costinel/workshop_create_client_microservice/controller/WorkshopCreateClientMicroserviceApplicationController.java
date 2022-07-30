package com.costinel.workshop_create_client_microservice.controller;

import com.costinel.workshop_create_client_microservice.repo.UserRepo;
import com.costinel.workshop_create_client_microservice.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkshopCreateClientMicroserviceApplicationController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/getAllClients")
    public List<Client> getAllClients(){
        return userRepo.findAll();
    }

    @GetMapping(value = "/getClient/{id}")
    public List<Client>  getClient(@PathVariable long id){
        return userRepo.findById(id).stream().toList();
    }

    @PostMapping(value = "/saveClient")
    public String saveClient(@RequestBody Client client){
        userRepo.save(client);
        return "Client saved successfully!";
    }

    @PutMapping(value = "/updateClient/{id}")
    public String updateClient(@PathVariable long id, @RequestBody Client client){
        Client clientToUpdate = userRepo.findById(id).get();
        clientToUpdate.setProNoun(client.getProNoun());
        clientToUpdate.setFirstName(client.getFirstName());
        clientToUpdate.setLastName(client.getLastName());
        clientToUpdate.setHomeAddress(client.getHomeAddress());
        clientToUpdate.setPostCode(client.getPostCode());
        clientToUpdate.setMobileNumber(client.getMobileNumber());
        clientToUpdate.setLandLineNumber(client.getLandLineNumber());
        clientToUpdate.setWorkNumber(client.getWorkNumber());
        clientToUpdate.setEmailAddress(client.getEmailAddress());
        userRepo.save(clientToUpdate);
        return "Client updated successfully!";
    }

    @DeleteMapping(value = "deleteClient/{id}")
    public String deleteClient(@PathVariable long id){
        userRepo.delete(userRepo.findById(id).get());
        return "Client deleted successfully!";
    }
}
