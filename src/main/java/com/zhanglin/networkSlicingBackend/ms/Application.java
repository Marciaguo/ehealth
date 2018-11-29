package com.zhanglin.networkSlicingBackend.ms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableSwagger2
//@ComponentScan("com.zhanglin.networkSlicingBackend.ms.controller")
@EnableAutoConfiguration
public class Application implements CommandLineRunner{
	@Override
	public void run(String... args) {
		// Do something when application starts.
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
}
