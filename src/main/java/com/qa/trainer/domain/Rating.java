package com.qa.trainer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rating {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private Long rating;
	private Long yearsExperience;
	
	public Rating()
	{
		
	}
	
	public Rating(Long rating, Long yearsExperience) {
		this.rating = rating;
		this.yearsExperience = yearsExperience;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public Long getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(Long yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
}
