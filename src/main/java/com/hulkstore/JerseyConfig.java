package com.hulkstore;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.hulkstore.controller.HulkStoreController;
import com.hulkstore.controller.ProductController;

/**
 * 
 * @author Alvaro Soto
 * 
 */
@Configuration
@ApplicationPath("rest")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
	}
	
	@PostConstruct
	public void setUp() {
		register(HulkStoreController.class);
		register(ProductController.class);
	}
	
}