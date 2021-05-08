package com.devsuperior.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}