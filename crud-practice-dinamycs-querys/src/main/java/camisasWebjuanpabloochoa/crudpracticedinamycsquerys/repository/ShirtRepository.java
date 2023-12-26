package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import camisasWebjuanpabloochoa.crudpracticedinamycsquerys.model.Shirt;

import jakarta.transaction.Transactional;
@Repository
@EnableJpaRepositories
@Transactional
public interface ShirtRepository extends JpaRepository<Shirt, Integer> {
	@Query(value= "SELECT st.id,st.shirt_mark_model,st.shirt_model,st.shirt_price_shirt FROM shirt st WHERE st.shirt_model = :modelShirt", nativeQuery = true)
	List<Shirt> findAllShirts(@Param("modelShirt")String model);
	@Query(value="UPDATE shirt st SET st.shirt_model = :modelShirt WHERE st.id = :idShirt ",nativeQuery = true)
	void updateShirtModel(@Param("modelShirt") String model, @Param("idShirt") Integer id);
//	@Query(value = "SELECT * FROM users u WHERE u.username = :username AND u.email = :email", nativeQuery = true)
//    List<User> findUsersByNativeQuery(@Param("username") String username, @Param("email") String email);
//	@Query(value="INSERT INTO shirt (shirt_model)",nativeQuery=true)
//	void saveForModel();
}