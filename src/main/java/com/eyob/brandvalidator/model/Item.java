package com.eyob.brandvalidator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Item {

	 @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private long id;
	 
	private String producName;
	private String productBrand;
	private String productDescription;
	private boolean produtFlag;
	private String fdaAdvisory;
	private String countryManufactured;
	private String cityManufactured;
	
	
	
	
	public String getCountryManufactured() {
		return countryManufactured;
	}
	public void setCountryManufactured(String countryManufactured) {
		this.countryManufactured = countryManufactured;
	}
	public String getCityManufactured() {
		return cityManufactured;
	}
	public void setCityManufactured(String cityManufactured) {
		this.cityManufactured = cityManufactured;
	}
	public String getFdaAdvisory() {
		return fdaAdvisory;
	}
	public void setFdaAdvisory(String fdaAdvisory) {
		this.fdaAdvisory = fdaAdvisory;
	}
	public String getProducName() {
		return producName;
	}
	public void setProducName(String producName) {
		this.producName = producName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public boolean isProdutFlag() {
		return produtFlag;
	}
	public void setProdutFlag(boolean produtFlag) {
		this.produtFlag = produtFlag;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
}
