package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
    public List<Quiz> findByCategory(String cat);
    
}
