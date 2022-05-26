package com.latihanbuku.latihanbuku;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LatihanbukuApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatihanbukuApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/book/*"))
				.apis(RequestHandlerSelectors.basePackage("com.latihanbuku.latihanbuku"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Buku",
				"Synrgy Batch 4 Backend Developer",
				"1.0.0",
				null,
				new springfox.documentation.service.Contact("Raja Ikhsan", "https://www.linkedin.com/in/rajahalomoan/",
						"rajaikhsanhalomoan@gmail.com"),
				null,
				null,
				Collections.emptyList());
	}
}
