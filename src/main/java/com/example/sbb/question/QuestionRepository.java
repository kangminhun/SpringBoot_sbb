package com.example.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.sbb.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	 Question findBySubject(String subject);
	 Question findBySubjectAndContent(String subject, String content);
}
