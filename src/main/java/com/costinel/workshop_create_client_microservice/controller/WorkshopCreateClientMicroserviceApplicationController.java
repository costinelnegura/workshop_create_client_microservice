package com.costinel.workshop_create_client_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkshopCreateClientMicroserviceApplicationController {

    @GetMapping(value = "/test")
    public String getString(){
        return "string test";
    }

}
