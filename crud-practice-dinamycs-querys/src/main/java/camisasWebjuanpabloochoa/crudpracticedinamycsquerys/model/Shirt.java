package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
//@Table(name="shirt_table")
public class Shirt {
	
	public Shirt() {
		
	}
	
	public Shirt(String model,String markModel, Double priceShirt) {
		this.model=model;
		this.markModel=markModel;
		this.priceShirt=priceShirt;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="shirt_model")
	private String model;
	@Column(name="shirt_markModel")
	private String markModel;
	@Column(name="shirt_priceShirt")
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
