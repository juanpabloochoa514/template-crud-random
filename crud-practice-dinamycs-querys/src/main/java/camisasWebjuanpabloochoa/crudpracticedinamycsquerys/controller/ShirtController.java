package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.Shirt;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.ShirtDto;
import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.service.ShirtServiceImpl;

@RestController
@RequestMapping("/shirts")
public class ShirtController {
	private static final Logger log = LoggerFactory.getLogger(ShirtController.class);
	@Autowired
	private ShirtServiceImpl shirtServiceImpl;
	
	@PostMapping("/addShirt")
	public ResponseEntity<String> setShirt(@RequestBody ShirtDto shirtDto ){
		try {
			shirtServiceImpl.insertShirt(shirtDto);
			return ResponseEntity.status(200).body("Shirt added");
		}catch(Exception e) {
			return ResponseEntity.status(500).body("internal error to add shirt");
		}
	}
	
	@GetMapping("/{model}")
	public ResponseEntity<List<Shirt>> getshirts(@PathVariable(value="model") String model){
		List<Shirt> shirtList=null;
		try {
			shirtList=shirtServiceImpl.listAllShirts(model);
			return	new ResponseEntity<List<Shirt>>(shirtList,HttpStatus.OK);
		}catch(Exception e) {
			log.error("Error  "+e);
			return new ResponseEntity<List<Shirt>>(shirtList,HttpStatus.NOT_FOUND);
		}
	}
	
	@PatchMapping("/{idShirt}")
	public ResponseEntity<String>updateShirPerModel( @RequestBody String model, @PathVariable(value="idShirt") Integer id){
		try {
			shirtServiceImpl.updatePerModel(model, id);
			return ResponseEntity.status(200).body("Shirt updated ");
		}catch(Exception e) {
			return ResponseEntity.status(404).body("shirt not updated, not found");
		}
	}
	
}
