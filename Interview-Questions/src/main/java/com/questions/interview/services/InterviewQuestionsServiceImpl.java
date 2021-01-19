package com.questions.interview.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questions.interview.model.InterviewQuestions;
import com.questions.interview.repositories.InterviewQuestionsRepository;

@Service
public class InterviewQuestionsServiceImpl implements InterviewQuestionsService{

	@Autowired
	private InterviewQuestionsRepository iQr;
	
	@Override
	public List<InterviewQuestions> listAllIQs() {
		List<InterviewQuestions> iqs = new ArrayList<>();
		iQr.findAll().forEach(iqs::add);
		return iqs;
	}

	@Override
	public void saveOrUpdateIQs(InterviewQuestions iq) {
		iQr.save(iq);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InterviewQuestions getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
