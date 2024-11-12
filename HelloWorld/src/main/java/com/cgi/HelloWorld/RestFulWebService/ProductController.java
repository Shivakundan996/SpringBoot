package com.cgi.HelloWorld.RestFulWebService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	private int saveProduct(@RequestBody Product product) {
		productService.saveOrUpdate(product);
		return product.getId();
	}
 
	@GetMapping("/getProducts")
	private List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteProducts(@PathVariable("id") int id) {
		productService.delete(id);
	}
	
	
}
