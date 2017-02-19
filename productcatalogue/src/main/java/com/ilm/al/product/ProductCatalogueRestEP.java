package com.ilm.al.product;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.common.vo.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Path("/pc")
public class ProductCatalogueRestEP {
	
	@Path("/products")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProducts() {
		return Response.ok().entity(Product.getAll()).build();
	}
	
	@Path("/products")
	@OPTIONS
	@Produces(MediaType.APPLICATION_JSON)
	public Response info() {
		String availableActions = "products (GET)";
		return Response.ok().entity(availableActions).build();
	}
}
