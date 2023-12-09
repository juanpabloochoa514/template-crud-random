package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.exceptions.ExceptionShirtNotFound;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.Shirt;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.repository.ShirtRepository;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ShirtServiceImpl {
	public ShirtServiceImpl() {

	}
	private static final Logger log = LoggerFactory.getLogger(ShirtServiceImpl.class);
	@Autowired
	private ShirtRepository shirtRepository;
	
	public void insertShirt(String model, String markModel,Double PriceShirt) {
		shirtRepository.saveShirt(model, markModel, PriceShirt);
	}
	
	public List<Shirt> listAllShirts() throws ExceptionShirtNotFound{
		
		try {
			return shirtRepository.findAllShirts();
		}catch(Exception e) {
			log.error("Error to get all shirts "+e);
			return null;
		}
	}
}
