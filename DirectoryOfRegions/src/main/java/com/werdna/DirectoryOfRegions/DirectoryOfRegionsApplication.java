package com.werdna.DirectoryOfRegions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DirectoryOfRegionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryOfRegionsApplication.class, args);
	}

}
