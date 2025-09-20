package com.vanevalo.ticketsystem.repository;

import com.vanevalo.ticketsystem.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
