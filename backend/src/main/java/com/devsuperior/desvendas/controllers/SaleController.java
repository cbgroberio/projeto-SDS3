package com.devsuperior.desvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.desvendas.dto.SaleDTO;
import com.devsuperior.desvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleservice;
	
	@GetMapping
	public ResponseEntity<List<SaleDTO>> findAll(){
		List<SaleDTO> list = saleservice.findAll();
		return ResponseEntity.ok(list);
		
	}
}
