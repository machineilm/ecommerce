package com.ilm.al.product;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.common.vo.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prodcatalogue")
public class ProductCatalogueRestEP {
	
	@RequestMapping(path="/products", method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON)
	public List<Product> getAllProducts() {
		return Product.getAll();
	}
	
/*	@RequestMapping(path="/products", method=RequestMethod.OPTIONS, produces=MediaType.APPLICATION_JSON)
	public String info() {
		String availableActions = "products (GET)";
		return availableActions;
	}
*/}
