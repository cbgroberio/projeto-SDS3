package com.devsuperior.desvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desvendas.dto.SaleDTO;
import com.devsuperior.desvendas.entities.Sale;
import com.devsuperior.desvendas.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository salerepository;
	
	public List<SaleDTO> findAll(){
		List<Sale> result = salerepository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}
}
