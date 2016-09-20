package com.semihbeceren.answers.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "questions")
public class Question extends MessageEntity{
	
	@Column(name = "title")
    @NotEmpty
	private String title;

	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question", fetch = FetchType.EAGER)
	private List<Comment> comments;
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
