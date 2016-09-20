package com.semihbeceren.answers.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.semihbeceren.answers.model.Question;

@RepositoryRestResource(collectionResourceRel = "question", path = "question")
public interface SpringDataQuestionRepository extends PagingAndSortingRepository<Question, Long>{

}
