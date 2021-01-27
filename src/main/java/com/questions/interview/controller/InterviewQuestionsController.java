package com.questions.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questions.interview.model.InterviewQuestions;
import com.questions.interview.services.InterviewQuestionsService;

@RestController
@CrossOrigin(origins = "*")
public class InterviewQuestionsController {
	@Autowired
	private InterviewQuestionsService iqs;

	@GetMapping("/getAllIAndQ")
	public List<InterviewQuestions> getAllInterviewQuestionsAndAnswers() {
		return iqs.listAllIQs();
	}

	@GetMapping("/getIAndQById/{id}")
	public InterviewQuestions getInterviewQuestionById(@PathVariable int id) {
		return iqs.getById(id);
	}

	@PostMapping("/saveInterviewQuestion")
	public InterviewQuestions saveInterviewQuestion(InterviewQuestions iq) {
		iqs.saveOrUpdateIQs(iq);
		return iqs.getById(iq.getId());
	}

	@DeleteMapping("/deleteIQById/{id}")
	public List<InterviewQuestions> deleteIAndQById(@PathVariable int id) {
		iqs.delete(id);
		return iqs.listAllIQs();
	}
}
//
//@FeignClient(name = "iqService", url = "http://localhost:8080/getAllIAndQ/")
//interface IQService {
//	@GetMapping("/listAllIAndQs")
//	List<InterviewQuestions> listAllIQs();
//}
