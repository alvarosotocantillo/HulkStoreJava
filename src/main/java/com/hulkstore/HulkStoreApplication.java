package com.hulkstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Alvaro Soto
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages="com.hulkstore")
public class HulkStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HulkStoreApplication.class, args);
	}
}
