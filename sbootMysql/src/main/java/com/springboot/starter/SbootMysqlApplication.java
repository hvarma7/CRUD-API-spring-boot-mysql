package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.starter.inti.controller",
		"com.springboot.starter.inti.pojo","com.springboot.starter.inti.repo","com.springboot.starter.inti.service"})
public class SbootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootMysqlApplication.class, args);
	}

}

