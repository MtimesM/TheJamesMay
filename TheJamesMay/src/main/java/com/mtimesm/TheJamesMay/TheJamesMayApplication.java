package com.mtimesm.TheJamesMay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheJamesMayApplication {

	public static void main(String[] args) {
		var dbUrl =
		SpringApplication.run(TheJamesMayApplication.class, args);
	}

}
