package com.kps.order.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {

	
	@DeleteMapping("/receiveOrder")
	public String getOrder() {
		return "Order retrieved";
	}
}
