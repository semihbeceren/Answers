package com.semihbeceren.answers.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User extends PersonEntity{

	@Column(name = "city")
    @NotEmpty
    private String city;
	
	@Column(name = "username")
    @NotEmpty
    private String userName;
	
	@Column(name = "password")
    @NotEmpty
    private String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
	private List<Comment> comments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
	private List<Question> questions;
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
