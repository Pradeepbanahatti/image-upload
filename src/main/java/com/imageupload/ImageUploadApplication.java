package com.imageupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.imageupload")
@SpringBootApplication
public class ImageUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageUploadApplication.class, args);
		System.out.println("-------------------------BOOOOOOOOOOTED-----------------------------");
	}

}
