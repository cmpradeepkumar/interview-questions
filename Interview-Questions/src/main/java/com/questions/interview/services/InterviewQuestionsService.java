package com.questions.interview.services;

import java.util.List;

import com.questions.interview.model.InterviewQuestions;

public interface InterviewQuestionsService {
	List<InterviewQuestions> listAllIQs();
	void saveOrUpdateIQs(InterviewQuestions iq);
	void delete(long id);
	InterviewQuestions getById(long id);	
}
