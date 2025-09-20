package com.vanevalo.ticketsystem.dto;

import com.vanevalo.ticketsystem.model.Agent;
import jakarta.validation.constraints.NotBlank;

public record ServiceDTO(@NotBlank String name,
                         Agent agent) {
}
