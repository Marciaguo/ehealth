package com.zhanglin.networkSlicingBackend.ms.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration

public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.zhanglin.networkSlicingBackend.ms.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Network slicing backend - API")
//				.title("网络切片后台 - API")
				.description("[ Base URL: /network-slicing-backend/api ]")
				.version("1.0")
                .contact(new Contact("Zhang Lin", "https://github.com/linyixiao/NetworkSlicingWeb", "@163.com"))
				.build();
	}
}
