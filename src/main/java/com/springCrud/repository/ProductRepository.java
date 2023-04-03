package com.springCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springCrud.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
