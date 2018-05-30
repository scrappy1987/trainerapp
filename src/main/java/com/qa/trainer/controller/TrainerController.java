package com.qa.trainer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qa.trainer.domain.Trainer;
import com.qa.trainer.service.TrainerService;

@RestController
@RequestMapping("api/v1")
public class TrainerController {
	
	@Autowired
	private TrainerService service;
	
	
	@RequestMapping(value = "trainer", method = RequestMethod.GET)
	public List<Trainer> list() {
		return service.list();
	}

	@RequestMapping(value = "trainer", method = RequestMethod.POST)
	public Trainer create(@RequestBody Trainer trainer) {
		return service.create(trainer);
	}

}
