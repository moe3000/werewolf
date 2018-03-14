package com.yclee.werewolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class WerewolfApplication {

	public static void main(String[] args) {
		SpringApplication.run(WerewolfApplication.class, args);
	}
}
