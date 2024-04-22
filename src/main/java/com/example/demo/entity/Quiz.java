package com.example.demo.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public Quiz(int quizid, String question, String[] answers, String correctAnswer, String category) {
		super();
		this.quizid = quizid;
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
		this.category = category;
	}
	public Quiz() {
		
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Quiz(int quizid, String question, String[] answers, String correctAnswer) {
		super();
		this.quizid = quizid;
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
	}
	@Override
	public String toString() {
		return "Quiz [quizid=" + quizid + ", question=" + question + ", answers=" + Arrays.toString(answers)
				+ ", correctAnswer=" + correctAnswer + ", category=" + category + ", categoryImage=" + categoryImage
				+ "]";
	}
	public int getQuizid() {
		return quizid;
	}
	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
  public int quizid;
  public String question;
  public String answers[]=new String[4];
  public String correctAnswer;
  public String category;
  public String categoryImage;	
  public String categoryDescription;	
	
}
