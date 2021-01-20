package com.questions.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questions.interview.model.InterviewQuestions;
import com.questions.interview.services.InterviewQuestionsService;

@RestController
public class InterviewQuestionsController {
	@Autowired
	private InterviewQuestionsService iqs;
	
	@GetMapping("/getAllIAndQ")
	public List<InterviewQuestions> getAllInterviewQuestionsAndAnswers(){
		return iqs.listAllIQs();
	}
	
}
