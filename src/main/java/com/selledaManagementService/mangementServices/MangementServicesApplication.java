package com.selledaManagementService.mangementServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.selledaManagementService.mangementServices.Controllers",
		"com.selledaManagementService.mangementServices.Model",
		"com.selledaManagementService.mangementServices.Repository",
		"com.selledaManagementService.mangementServices.Services"})

public class MangementServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MangementServicesApplication.class, args);
	}

}
