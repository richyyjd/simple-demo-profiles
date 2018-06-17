package com.simpledemoprofiles.simpledemoprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SimpleDemoProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDemoProfilesApplication.class, args)
	}
}
