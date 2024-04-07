package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserQuiz {
	@Override
	public String toString() {
		return "UserQuiz [quizId=" + quizId + ", score=" + score + ", cat=" + cat + "]";
	}
	public UserQuiz() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int quizId;
	public int score;
	public String cat;
	public int getQuizId() {
		return quizId;
	}
	public UserQuiz(int score, String cat) {
		super();
		this.score = score;
		this.cat = cat;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	

}
