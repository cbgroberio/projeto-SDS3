package com.devsuperior.desvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.desvendas.dto.SaleDTO;
import com.devsuperior.desvendas.entities.Sale;
import com.devsuperior.desvendas.repositories.SaleRepository;
import com.devsuperior.desvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository salerepository;
	
	@Autowired
	private SellerRepository sellerepository;
	
	// Transacional: resolver toda a OP no DB nessa transacao
	// readyOnly: nao fazer lock no DB
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		//busca os sellers e deixa na memoria para evitar retornos desnecessarios ao DB
		sellerepository.findAll(); 
		
		Page<Sale> result = salerepository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	/*
	public List<SaleDTO> findAll(){
		List<Sale> result = salerepository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}*/
}
