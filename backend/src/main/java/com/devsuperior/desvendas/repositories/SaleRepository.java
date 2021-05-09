package com.devsuperior.desvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.desvendas.dto.SaleSuccessDTO;
import com.devsuperior.desvendas.dto.SaleSumDTO;
import com.devsuperior.desvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	//JPQL
	@Query("SELECT new com.devsuperior.desvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	//JPQL
	@Query("SELECT new com.devsuperior.desvendas.dto.SaleSuccessDTO (obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}