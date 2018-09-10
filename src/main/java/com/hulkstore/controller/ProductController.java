package com.hulkstore.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.hulkstore.model.Product;
import com.hulkstore.service.ProductService;

/**
 * 
 * @author Alvaro Soto
 * 
 */
@Component
@Path("/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@POST
	@Path("/post/create")
	@Consumes("application/json")
	public Response createProduct(Product product) {
		productService.add(product);
		return Response.status(201).build();
		
	}
	
	@PUT
	@Path("/post/update")
	@Consumes("application/json")
	public Response updateProduct(Product product) {
		productService.update(product);
		return Response.status(200).build();
		
	}
	
	@DELETE
	@Path("/deleteProduct/{sku}")
	public Response deleteProduct(@PathParam("sku") String sku) {
		Product product = productService.findById(sku);
		productService.delete(product);
		return Response.ok().build();
	}

	@GET
	@Produces("application/json")
	@Path("/findBySku/{sku}")
	public Product findBySku(@PathParam("sku") String sku) {
		return productService.findById(sku);
	}

	@GET
	@Produces("application/json")
	@Path("/findAll")
	public Collection<Product> findAll() {
		return productService.findAll();
	}

	@GET
	@Produces("application/json")
	@Path("/test")
	public List<String> findStringTest() {
//		return productService.findAll();
		List<String> lista = new ArrayList<String>();
		lista.add("Find String Test Works!");
		return lista;
	}
	
}
