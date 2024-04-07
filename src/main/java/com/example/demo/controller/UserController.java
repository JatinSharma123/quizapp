package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Quiz;
import com.example.demo.entity.User;
import com.example.demo.entity.UserQuiz;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService user;
   @PostMapping("/login")
    public User login(@RequestBody User u) {
	   
	     return user.loginUser(u.email,u.password);
	     
	   
	   
   }
   @PostMapping("/register")
   public User register(@RequestBody User u) 
   {
	   
	     return user.createUser(u);
	     
   }
   @GetMapping("/results/{id}")
   public List<UserQuiz> quizResults(@PathVariable("id")int id){
	        
	    return user.getResults(id);
   }
   @GetMapping("/allUsers")
    public List<User> allUsers(){
	   return user.allUsers();  
   }
   @GetMapping("/admin")
    public User addAdmin(@RequestBody User u) {
	   
	    return user.insertAdmin(u);	
	   
   }
}
