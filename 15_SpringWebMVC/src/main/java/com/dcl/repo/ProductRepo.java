package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Product;
import com.dcl.enums.Category;
import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	List<Product> findByCategory(Category category);
}
