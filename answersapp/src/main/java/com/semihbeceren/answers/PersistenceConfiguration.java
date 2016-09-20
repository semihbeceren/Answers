package com.semihbeceren.answers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.semihbeceren.answers.model.Comment;
import com.semihbeceren.answers.model.Question;
import com.semihbeceren.answers.model.User;
import com.semihbeceren.answers.repository.SpringDataCommentRepository;
import com.semihbeceren.answers.repository.SpringDataQuestionRepository;
import com.semihbeceren.answers.repository.SpringDataUserRepository;


@Configuration
@EnableJpaRepositories

public class PersistenceConfiguration {

	@Autowired
	private SpringDataCommentRepository commentRepository;
	
	@Autowired
	private SpringDataQuestionRepository questionRepository;
	
	@Autowired
	private SpringDataUserRepository userRepository;
	
	@PostConstruct
	private void fillDatabase(){
		
		User user = new User();
		user.setFirstName("Semih");
		user.setLastName("Beceren");
		user.setPassword("123456");
		user.setCity("İzmir");
		user.setUsername("semko");
		userRepository.save(user);
		System.out.println("id: " + user.getId());
		 
		
		List<Question> questions = new ArrayList<>();
		Question question = new Question();
		question.setTitle("Deneme Başlık");
		question.setBody("Deneme Body.Deneme Body");
		questionRepository.save(question);
		
		Comment comment = new Comment();
		comment.setBody("Deneme bdy comment");
		commentRepository.save(comment);
		
		List<Comment> comments = new ArrayList<>();
		comments.add(comment);
		
		question.setComments(comments);
		questions.add(question);
		user.setQuestions(questions);
		
		userRepository.save(user);
		
		
	}
	
}
