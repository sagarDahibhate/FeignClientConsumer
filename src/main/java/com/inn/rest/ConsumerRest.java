package com.inn.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerRest {

	@Autowired
	private VendorRestConsumer consumer;

	@GetMapping("/data")
	public String getData() {
		ResponseEntity<String> resp = consumer.getmsg();
		return "FROM PRODUCT=>" + resp.getBody();
	}

}
