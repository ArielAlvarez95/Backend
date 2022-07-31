package com.portfolioap.argprog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class ArgprogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArgprogApplication.class, args);
	}
        @Bean
        public WebMvcConfigurer corsConfigurer(){
                return new WebMvcConfigurer(){
                    @Override
                    public void addCorsMappings(CorsRegistry registry){
                        registry.addMapping("")
                                .allowedOrigins("https://proyectofinalargprog-24f4c.web.app/")
                                .allowedMethods("GET", "POST", "PUT", "DELETE")
                                .allowedHeaders("Access-Control-Allow-Origin")
                                .maxAge(3600);              
                    } 
        };
}
}