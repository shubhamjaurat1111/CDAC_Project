package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.pojo.Category;
import com.project.pojo.Product;
import com.project.pojo.User;

public interface IProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByUser(User u);

	List<Product> findByCategory(Category category);

	@Query(value = "select p from Product p where name LIKE ?1")
	List<Product> findByName(String string);

}
	