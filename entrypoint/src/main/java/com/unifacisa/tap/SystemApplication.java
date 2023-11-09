package com.unifacisa.tap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
