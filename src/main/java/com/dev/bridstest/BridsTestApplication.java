package com.dev.bridstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BridsTestApplication.class, args);

		System.out.println("===>>> Looping Algorithm <<<===");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
