package com.vanevalo.ticketsystem.model;

import com.vanevalo.ticketsystem.dto.ServiceDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "services")
@Entity(name = "Service")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Agent agent;

    public Service(ServiceDTO serviceDTO) {
        this.id = null;
        this.name = serviceDTO.name();
    }
}
