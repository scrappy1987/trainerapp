package com.qa.trainer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.trainer.domain.Trainer;
import com.qa.trainer.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService {
	
	@Autowired
	private TrainerRepository repository;
	
	public List<Trainer> list() {
		return repository.findAll();
	}

	@Override
	public Trainer create(Trainer movie) {
		return repository.saveAndFlush(movie);
	}


}
