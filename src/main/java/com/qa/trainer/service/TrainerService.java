package com.qa.trainer.service;

import java.util.List;

import com.qa.trainer.domain.Trainer;

public interface TrainerService {

	List<Trainer> list();

	Trainer create(Trainer movie);

}