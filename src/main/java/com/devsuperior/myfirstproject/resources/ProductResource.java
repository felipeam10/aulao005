package com.devsuperior.myfirstproject.resources;

import java.time.Instant;
import java.util.List;

import com.devsuperior.myfirstproject.resources.exceptions.StandardError;
import com.devsuperior.myfirstproject.services.ProductService;
import com.devsuperior.myfirstproject.services.exceptions.EntityNofFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
			Product obj = productService.findById(id);
			return ResponseEntity.ok().body(obj);

	}
}
