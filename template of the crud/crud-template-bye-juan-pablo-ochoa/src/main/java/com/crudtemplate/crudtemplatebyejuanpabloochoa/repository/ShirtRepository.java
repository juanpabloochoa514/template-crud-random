package com.crudtemplate.crudtemplatebyejuanpabloochoa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crudtemplate.crudtemplatebyejuanpabloochoa.model.Shirt;

public interface ShirtRepository  extends JpaRepository<Shirt, Integer>{
	@Modifying
	@Query(value = "INSERT INTO shirt_table (id,shirt_model, shirt_markModel, shirt_priceShirt) VALUES (:id, :shirt_model, :shirt_markMOdel, :shirt_priceShirt)", nativeQuery = true)
	void saveShirt(@Param("shirt_model") String model,@Param("shirt_markModel") String markModel,@Param("shirt_priceShirt") Double priceShirt);
	@Query("SELECT u FROM shirt_table u")
	List<Shirt> findAllShirts();
}
