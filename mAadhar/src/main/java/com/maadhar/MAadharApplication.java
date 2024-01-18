package com.maadhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.maadhar.pojo")
@EnableJpaRepositories("com.maadhar.repo")
public class MAadharApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAadharApplication.class, args);
	}

}
