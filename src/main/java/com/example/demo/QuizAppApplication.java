package com.example.demo;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.dao.QuizDao;
import com.example.demo.dao.UserDao;
 

@SpringBootApplication
@CrossOrigin({"https://quizappspringreact.netlify.app/","https://quizappbackend-production-af37.up.railway.app/","http://localhost:3000"})
public class QuizAppApplication {

	@Autowired
	QuizDao ud;

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(QuizAppApplication.class, args);
		
	}

    @Bean
    public ModelMapper modelMapperBean() {
        
    	return new ModelMapper();
    }
    @Bean
    public WebMvcConfigurer corsConfigurer()
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
     

}
