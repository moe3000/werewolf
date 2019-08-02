package com.yclee.werewolf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WerewolfApplication {

	public static void main(String[] args) {
		SpringApplication.run(WerewolfApplication.class, args);
	}
}
