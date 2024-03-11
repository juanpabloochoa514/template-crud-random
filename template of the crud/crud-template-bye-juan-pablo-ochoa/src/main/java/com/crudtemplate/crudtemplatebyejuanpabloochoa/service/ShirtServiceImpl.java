package com.crudtemplate.crudtemplatebyejuanpabloochoa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.crudtemplate.crudtemplatebyejuanpabloochoa.model.Shirt;
import com.crudtemplate.crudtemplatebyejuanpabloochoa.repository.ShirtRepository;

public class ShirtServiceImpl {
	public ShirtServiceImpl() {

	}
	private static final Logger log = LoggerFactory.getLogger(ShirtServiceImpl.class);
	@Autowired
	private ShirtRepository shirtRepository;
	
	public void insertShirt(String model, String markModel,Double PriceShirt) {
		shirtRepository.saveShirt(model, markModel, PriceShirt);
	}
	
	public List<Shirt> listAllShirts(){
		
		try {
			return shirtRepository.findAllShirts();
		}catch(Exception e) {
			log.error("Error to get all shirts "+e);
			return null;
		}
	}
}
