package com.eluky.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class PersonalBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalBlogApplication.class, args);
	}

}
