package com.example.demo;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizAppApplication {

	

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(QuizAppApplication.class, args);
		
	}

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
     

}
