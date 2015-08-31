package com.mrgss.web.persistence.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

@Entity
@Table(name = "species")
public class SpeciesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date startDate;

	@OneToMany
	@Column(nullable=false)
	private List<RaceEntity> races;
	
	public List<RaceEntity> getRaces() {
		return races;
	}

	public void setRaces(List<RaceEntity> races) {
		this.races = races;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getStartDate() {
		return new DateTime(startDate);
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate.toDate();
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SpeciesEntity [id=" + id + ", name=" + name + ", startDate="
				+ startDate + ", races=" + races + "]";
	}
}