package com.uth.dyslexia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DyslexiaApplication {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(DyslexiaApplication.class, args);
	}

}
