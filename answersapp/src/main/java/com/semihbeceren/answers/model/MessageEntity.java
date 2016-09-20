package com.semihbeceren.answers.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public class MessageEntity extends BaseEntity{
	
	@Column(name = "body")
    @NotEmpty
	protected String body;

	@Column(name = "date_time")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	protected LocalDateTime dateTime;
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
