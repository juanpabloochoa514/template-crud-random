package com.crudtemplate.crudtemplatebyejuanpabloochoa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudtemplate.crudtemplatebyejuanpabloochoa.repository.ShirtRepository;
import com.crudtemplate.crudtemplatebyejuanpabloochoa.service.ShirtServiceImpl;

@RestController
@RequestMapping("/shirts")
public class ShirtController {
private static final Logger log = LoggerFactory.getLogger(ShirtController.class);
	
	public ShirtController() {

	}

	@Autowired
	private ShirtServiceImpl shirtServiceImpl;
	
	@PostMapping("/addShirt")
	public ResponseEntity<String> setShirt(@RequestParam String name, @RequestParam String markModel, @RequestParam Double priceUnit){
		try {
			shirtServiceImpl.insertShirt(name, markModel, priceUnit);
			return ResponseEntity.status(200).body("Shirt added");
		}catch(Exception e) {
			return ResponseEntity.status(500).body("internal error to add shirt");
		}
	}
	
	@GetMapping("/getAllShirts")
	public ResponseEntity<String> getshirts(){
		try {
			shirtServiceImpl.listAllShirts();
			return	ResponseEntity.status(200).body("list of shirts");
		}catch(Exception e) {
			log.error("Error  "+e);
			return ResponseEntity.status(500).body("error to list. Internal error");
		}
	}
}
