package dev.knowledgecafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.knowledgecafe.ConfigUtil;

@RestController
@RequestMapping("/")
@RefreshScope
public class HelloController {

	@Autowired
	private ConfigUtil config;

	@Autowired
	private Environment environment;
	
	@GetMapping("/dbinfo")
	public String getDBInfo(){

		return "Database name : "+ config.getDatabaseName();
	}
}
