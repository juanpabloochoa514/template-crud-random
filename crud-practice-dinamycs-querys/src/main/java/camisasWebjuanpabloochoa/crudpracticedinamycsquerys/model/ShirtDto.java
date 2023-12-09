package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model;

import jakarta.persistence.Column;

public class ShirtDto {
	
	public ShirtDto() {
		
	}
	public ShirtDto(String model, String markmodel, Double priceShirt) {
		this.model=model;
		this.markModel=markModel;
		this.priceShirt=priceShirt;	
	}
	public ShirtDto(Integer id,String model, String markmodel, Double priceShirt) {
		this.id=id;
		this.model=model;
		this.markModel=markModel;
		this.priceShirt=priceShirt;	
		
	}
	private Integer id;
	private String model;
	private String markModel;
	private Double priceShirt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarkModel() {
		return markModel;
	}
	public void setMarkModel(String markModel) {
		this.markModel = markModel;
	}
	public Double getPriceShirt() {
		return priceShirt;
	}
	public void setPriceShirt(Double priceShirt) {
		this.priceShirt = priceShirt;
	}
	
	
}
