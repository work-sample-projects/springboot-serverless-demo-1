package com.test.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages= {"com.test.controller"})
public class SpringBootWebApplication {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}