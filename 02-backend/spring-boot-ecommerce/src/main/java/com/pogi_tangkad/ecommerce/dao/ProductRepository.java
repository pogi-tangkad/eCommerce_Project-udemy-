package com.pogi_tangkad.ecommerce.dao;


import com.pogi_tangkad.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
