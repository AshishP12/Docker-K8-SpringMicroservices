package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hotel;

@SpringBootApplication
public class HotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInfoServiceApplication.class, args);
	}

	
	@Bean
	public  Hotel sagar() {
		
		return new Hotel(101, "Krishna sagar", "Marathalli");
	}
	
	@Bean
	public  Hotel Ratna() {
		
		return new Hotel(102, "Sagar Ratna", "Allahabad");
	}

	@Bean
	public  Hotel sangeetha() {
		
		return new Hotel(103, "Hotel sangeetha", "Chennnai");
	}

}
