package com.mrgss.web.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

@Entity
@Table(name = "patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private ClientEntity client;
	
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date startDate;
	
	@ManyToOne
	private RaceEntity race;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date birthday;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date deceasedDate;

	public ClientEntity getClient() {
		return client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
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

	public DateTime getDeceasedDate() {
		return new DateTime(deceasedDate);
	}

	public void setDeceasedDate(DateTime deceasedDate) {
		this.deceasedDate = deceasedDate.toDate();
	}

	public RaceEntity getRace() {
		return race;
	}

	public void setRace(RaceEntity race) {
		this.race = race;
	}

	public DateTime getBirthday() {
		return new DateTime(birthday);
	}

	public void setBirthday(DateTime birthday) {
		this.birthday = birthday.toDate();
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", client=" + client + ", name="
				+ name + ", startDate=" + startDate + ", race=" + race
				+ ", birthday=" + birthday + ", deceasedDate=" + deceasedDate
				+ "]";
	}
}