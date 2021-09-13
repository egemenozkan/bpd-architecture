package com.birprojedaha.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.birprojedaha.*"})
public class MultiModuleArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiModuleArchApplication.class, args);
	}

}
