package com.semihbeceren.answers.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment extends MessageEntity{

	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
    @JoinColumn(name = "question_id")
	private Question question;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
