package com.devsuperior.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}