package com.devsuperior.desvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desvendas.dto.SellerDTO;
import com.devsuperior.desvendas.entities.Seller;
import com.devsuperior.desvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerrepository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = sellerrepository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
