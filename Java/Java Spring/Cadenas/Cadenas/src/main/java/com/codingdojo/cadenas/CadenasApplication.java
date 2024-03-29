package com.codingdojo.cadenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}
@RequestMapping("/")
	public String hello() {
		return "<h1>Hello Client! How are you doing?</h1>";
}
	@RequestMapping("/random")
		public String random() {
			return "<h2>Spring Boot is great! So easy to just respond with strings</h2>";
	}

}
