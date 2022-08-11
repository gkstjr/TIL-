package com.kh.spring18.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerCustomConfiguration {
///	<bean id = "passwordEncoder" class = "어쩌구저쩌구.BcryptPasswordEncoder"/>

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
//					.apis(RequestHandlerSelectors.any())
//					.apis(RequestHandlerSelectors.basePackage("com.kh.spring18.rest"))
					.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
					.paths(PathSelectors.any())
				.build()
					.apiInfo(
								new ApiInfoBuilder()
								.title("문서의 제목")
								.description("문서의 설명")
								.version("0.0.1")
								.license("MIT License")
							.build()
						)
						.useDefaultResponseMessages(false)
						;
				
	}
}
