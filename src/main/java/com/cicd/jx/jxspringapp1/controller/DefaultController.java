package com.cicd.jx.jxspringapp1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController("/")
public class DefaultController {

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@Timed
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<>("Hello!! this is Jx managed spring boot app - 1", HttpStatus.OK);
	}

}
