package com.example.sbb;

import java.lang.foreign.Linker.Option;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sbb.answer.Answer;
import com.example.sbb.answer.AnswerRepository;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;
import com.example.sbb.question.QuestionService;
import com.example.sbb.user.SiteUser;
import com.example.sbb.user.UserService;

//import com.example.sbb.QuestionRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.List;

//import java.util.Optional;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private QuestionService questionservice;
    
    @Autowired
    private UserService userService;

    @Test
    void testJpa() {        
		
		/*
		 * Question q1 = new Question(); q1.setSubject("demo가 무엇인가요?");
		 * q1.setContent("demo에 대해서 알고 싶습니다."); q1.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q1); // 첫번째 질문 저장
		 * 
		 * Question q2 = new Question(); q2.setSubject("스프링부트 모델 질문입니다.");
		 * q2.setContent("id는 자동으로 생성되나요?"); q2.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q2); // 두번째 질문 저장
		 */    	
		
		  //question 테이블에 저장된 모든 데이터를 조회하기 위해서 리포지터리(questionRepository)의 findAll 메서드를사용했다.
			/*
			 * List<Question> all = this.questionRepository.findAll(); assertEquals(2,
			 * all.size());
			 * 
			 * Question q = all.get(0); assertEquals("demo가 무엇인가요?", q.getSubject());
			 */
    	
		/*
		 * //id값으로 데이터를 조회하기 위해서는 리포지터리의 findById 메서드를 사용 Optional<Question> oq =
		 * this.questionRepository.findById(1); if(oq.isPresent()) { Question q =
		 * oq.get(); assertEquals("demo가 무엇인가요?", q.getSubject()); }
		 */
    	
		
		/*
		 * Question q = this.questionRepository.findBySubjectAndContent("demo가 무엇인가요?",
		 * "demo에 대해서 알고 싶습니다."); assertEquals(1, q.getId());
		 */
		
		/*
		 * Optional<Question> oq=this.questionRepository.findById(1);
		 * assertTrue(oq.isPresent()); Question q=oq.get(); q.setSubject("수정");
		 * this.questionRepository.save(q);
		 */
		 
		 
		
		/*
		 * for(int i = 1; i <= 300; i++) { String subject =
		 * String.format("테스트 데이터입니다:[%03d]", i); String content = "내용없음";
		 * this.questionservice.create(subject, content, null); }
		 */
		 
    	UserService us=this.userService;
    	us.create("민훈", "alsgns1295@gmail.com", "1234");
    	
    	
    }
}
