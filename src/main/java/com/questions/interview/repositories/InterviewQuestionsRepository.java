package com.questions.interview.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.questions.interview.model.InterviewQuestions;

@Repository
public interface InterviewQuestionsRepository extends CrudRepository<InterviewQuestions, Long>{

}
