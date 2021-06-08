package com.inn.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("producer")
public interface VendorRestConsumer {

	@GetMapping("/producer/getmsg")
	public ResponseEntity<String> getmsg();
}
