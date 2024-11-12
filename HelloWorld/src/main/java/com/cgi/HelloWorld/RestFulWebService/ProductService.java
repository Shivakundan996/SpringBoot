package com.cgi.HelloWorld.RestFulWebService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductInterface repository;
	
	public List<Product> getAllProducts(){
		List<Product> prodcuts = new ArrayList<>();
		repository.findAll().forEach(p -> prodcuts.add(p));
		return prodcuts;
	}

	public void saveOrUpdate(Product product) {
		repository.save(product);
	}
	
	public void delete(int id) {
		repository.deleteById(id);
	}
	
}
