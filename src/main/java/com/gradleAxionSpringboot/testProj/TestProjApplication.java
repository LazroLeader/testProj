package com.gradleAxionSpringboot.testProj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class TestProjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestProjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	// From Command line
		log.info("Tavisufleba Mishkas");
	}

}
