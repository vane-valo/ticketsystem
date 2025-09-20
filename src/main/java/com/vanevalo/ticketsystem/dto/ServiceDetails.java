package com.vanevalo.ticketsystem.dto;

import com.vanevalo.ticketsystem.model.Agent;
import com.vanevalo.ticketsystem.model.Service;

public record ServiceDetails(Long id,
                             String name,
                             Agent agent) {

    public ServiceDetails(Service service){
        this(service.getId(), service.getName(), service.getAgent());
    }
}
