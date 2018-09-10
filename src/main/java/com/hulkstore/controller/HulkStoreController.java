package com.hulkstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Alvaro Soto
 * 
 */
@Controller
public class HulkStoreController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "HulkStore rocks!";
	}
}
