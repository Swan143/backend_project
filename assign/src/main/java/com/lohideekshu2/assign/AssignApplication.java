package com.lohideekshu2.assign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class AssignApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignApplication.class, args);
	}
	
	@Bean
	  public Docket docket() {
        return new     Docket(DocumentationType.SWAGGER_2)
                .groupName("Reno Carrier")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lohideekshu2.assign.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Reno Carrier API")
                .description("Spring Rest API reference")
                .licenseUrl("SHIVAKUMMAR.g@gmail.com")
                .version("1.0")
                .build();
    }
	
	@Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }

}





















