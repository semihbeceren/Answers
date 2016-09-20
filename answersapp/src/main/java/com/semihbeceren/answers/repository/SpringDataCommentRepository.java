package com.semihbeceren.answers.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.semihbeceren.answers.model.Comment;

@RepositoryRestResource(collectionResourceRel = "comment", path = "comment")
public interface SpringDataCommentRepository extends PagingAndSortingRepository<Comment, Long>{

}
