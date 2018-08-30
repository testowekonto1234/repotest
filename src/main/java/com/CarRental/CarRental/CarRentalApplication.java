package com.CarRental.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.CarRental.CarRental")
public class CarRentalApplication {


	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}
}
