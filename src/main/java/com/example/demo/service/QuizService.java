package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.QuizDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Quiz;
import com.example.demo.entity.User;
import com.example.demo.entity.UserQuiz;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quiz;
	@Autowired
	UserDao user;
	public List<Quiz> getQuiz(String cat){
		
		return quiz.findByCategory(cat);
		
		
	}
	
	public ArrayList<Quiz> addQuiz(ArrayList<Quiz> q) 
	{
		try {
			 for(Quiz q1:q) {
				 quiz.save(q1);
			 }
			return q;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
		
	}
	
public List<String> getCat(){
	try {

		List<Quiz>allQuiz= quiz.findAll();
		Set<String>cat=new HashSet<>();
		for(Quiz q:allQuiz) {
			int question=0;
			String currentCat=q.getCategory();
			  for(Quiz q1:allQuiz) {
				    if(currentCat.equals(q1.category))
				    {
				    	question++;
				    }
			  }
			  if(question>=10)
			 cat.add(q.getCategory());
		}
		
		
		List<String>res=new ArrayList<>(cat);
		return res;	
		
	} catch (Exception e) {
		// TODO: handle exception
		return null;
	}
		
		
		
		
		
	}

public String submitQuiz(int userId,int score,String cat) {
	 try {
		 
		 
		  Optional<User> currentUser=user.findById(userId);
		  
		  
		   
		  if(currentUser.get()!=null) 
		  {
			 User u= currentUser.get();
			 UserQuiz userQuiz=new UserQuiz(score,cat);
			 
			 
			 u.allQuiz.add(userQuiz);
			 user.save(u);
			 return "Save data succesfully";
			 
			  
		  }
		  return "Not able to save data";
		 
		 
		  
		
		 
		
	} catch (Exception e) {
		// TODO: handle exception
		  System.out.println(e);
		return "Sorry not able to save data";
	}
}

 

}
