package com.qa.trainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.trainer.domain.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}
