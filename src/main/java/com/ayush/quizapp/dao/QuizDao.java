package com.ayush.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayush.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
