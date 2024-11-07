package com.zero.jasypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class ZeroJasyptBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroJasyptBootApplication.class, args);
	}

}
