package com.alunoonline.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AlunoOnlineApplication {

	public static void main(String[] args) {

		SpringApplication.run(AlunoOnlineApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}

}
