package com.earthwatch.rigel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class RigelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RigelApplication.class, args);
	}

	@Bean
	public Function<String, String> reverseString() {
		return new MyHandler();
	}

}
