package edu.eci.ieti.persistence.JavaPersistance.repositories;

import edu.eci.ieti.persistence.JavaPersistance.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
