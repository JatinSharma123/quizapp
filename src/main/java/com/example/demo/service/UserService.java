package com.example.demo.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Quiz;
import com.example.demo.entity.User;
import com.example.demo.entity.UserQuiz;

@Service
public class UserService {
	@Autowired
	UserDao user;
        
	public User createUser(User u) {
	   System.out.println(u);
		try {
			
			 
			User findUser=user.findByEmailOrUserName(u.getEmail(),u.getUserName());
			  if(findUser!=null)
			  {
				  
				return null;  
			  }
			  
			return user.save(u);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		  return null;
		}
		
	}
	public User loginUser(String email,String password) {
		try {
			
			return user.findByEmailAndPassword(email,password);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		  return null;
		}
		
	}
	public List<UserQuiz> getResults(int id){
		Optional<User>op=user.findById(id);
		 if(op.get()!=null) {
			  
			  User u=op.get();
			  List<UserQuiz>li=u.getAllQuiz();
			  Collections.reverse(li);
			return li;
			  
		 }
		 else
			 return null;
		  
	}
	public List<User> allUsers(){
	return user.findAll();
		
	
	}
    
  public User insertAdmin(User u) {
	 return  user.save(u); 
  }	
}