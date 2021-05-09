package com.devsuperior.desvendas.dto;

import java.io.Serializable;

import com.devsuperior.desvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double saleSum;
	
	
	public SaleSumDTO() {
		
	}


	public SaleSumDTO(Seller seller, Double saleSum) {
		super();
		this.sellerName = seller.getName();
		this.saleSum = saleSum;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Double getSaleSum() {
		return saleSum;
	}


	public void setSaleSum(Double saleSum) {
		this.saleSum = saleSum;
	}
	
	
	
}
