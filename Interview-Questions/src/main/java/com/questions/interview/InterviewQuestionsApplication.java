package com.questions.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.questions.interview.model.InterviewQuestions;
import com.questions.interview.repositories.InterviewQuestionsRepository;

@SpringBootApplication
public class InterviewQuestionsApplication implements CommandLineRunner {
	
	@Autowired
	private InterviewQuestionsRepository iqr;
	
	public static void main(String[] args) {
		SpringApplication.run(InterviewQuestionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		InterviewQuestions iq1 = new InterviewQuestions();
		iq1.setId(1);
		iq1.setQuestion("Whats Multithreading?");
		iq1.setAnswer("Executing an application using a thread within a CPU is multithreading");
		iq1.setType("Java");
		
		iqr.save(iq1);
	}

}
