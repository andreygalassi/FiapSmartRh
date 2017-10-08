package br.com.fiap.scj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HypermediaAutoConfiguration.class)
@Configuration
public class SmartRhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartRhApplication.class, args);
	}
}
