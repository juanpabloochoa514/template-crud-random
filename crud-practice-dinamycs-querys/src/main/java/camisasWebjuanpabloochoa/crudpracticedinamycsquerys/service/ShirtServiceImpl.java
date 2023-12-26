package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.service;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.Shirt;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.ShirtDto;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.repository.ShirtRepository;
@Service
public class ShirtServiceImpl {
	private static final Logger log = LoggerFactory.getLogger(ShirtServiceImpl.class);
	@Autowired
	private ShirtRepository shirtRepository;
	@Autowired
	private ModelMapper modelMapper;

	public void insertShirt(ShirtDto shirtDto){
		Shirt shirtSave = this.convertToEntity(shirtDto);
		shirtRepository.save(shirtSave);
	}
	
	
	public List<Shirt> listAllShirts(String model){
		
		try {
			return shirtRepository.findAllShirts(model);
			
		}catch(Exception e) {
			log.error("Error to get all shirts "+e);
			return null;
		}
	}

	public void updatePerModel(String model, Integer id) {
			try {
				shirtRepository.updateShirtModel(model, id);
				
			}catch(Exception e) {
				log.error(" error to update "+e);
				
			}
	}
	
	public Shirt convertToEntity(ShirtDto shirtDto)throws ParseException {
		Shirt shirt = modelMapper.map(shirtDto, Shirt.class);
		return shirt;
	}

	
}
