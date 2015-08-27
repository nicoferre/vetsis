package com.mrgss.web.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "race")
public class RaceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	private SpeciesEntity species;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpeciesEntity getSpecies() {
		return species;
	}

	public void setSpecies(SpeciesEntity species) {
		this.species = species;
	}

	public Long getId() {
		return id;
	}
}