package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
 
	  public User findByEmailAndPassword(String email,String password);
	  public User findByEmailOrUserName(String email,String userName);
	  
}
