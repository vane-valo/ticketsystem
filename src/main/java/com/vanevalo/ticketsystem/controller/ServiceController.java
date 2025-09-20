package com.vanevalo.ticketsystem.controller;

import com.vanevalo.ticketsystem.dto.ServiceDTO;
import com.vanevalo.ticketsystem.dto.ServiceDetails;
import com.vanevalo.ticketsystem.model.Service;
import com.vanevalo.ticketsystem.repository.ServiceRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceRepository repository;

    @Transactional
    @PostMapping
    public ResponseEntity register(@RequestBody @Valid ServiceDTO serviceDTO, UriComponentsBuilder uriComponentsBuilder){
        var service = new Service(serviceDTO);
        repository.save(service);

        var uri = uriComponentsBuilder.path("/services/{id}").buildAndExpand(service.getId()).toUri();

        return ResponseEntity.created(uri).body(new ServiceDetails(service));
    }

}
