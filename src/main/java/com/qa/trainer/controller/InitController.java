package com.qa.trainer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.trainer.domain.Rating;
import com.qa.trainer.domain.Subject;
import com.qa.trainer.domain.Trainer;
import com.qa.trainer.service.TrainerService;

@RestController
@RequestMapping("api/v1")
public class InitController {
	
	@Autowired
	private TrainerService service;
	
	
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String list() {
		Trainer aTrainer = new Trainer("John", "Gordon", "Training Manager");
		Subject aSubject = new Subject("Java EE", new Rating(1l,4l));
		List<Subject> aList = new ArrayList<>();
		aList.add(aSubject);
		aTrainer.setSubject(aList);
		service.create(aTrainer);
		return "db initalised";
	}

}
