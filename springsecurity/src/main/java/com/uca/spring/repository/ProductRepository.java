package com.uca.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
