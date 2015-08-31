package com.mrgss.web.persistence.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

@Entity
@Table(name = "client")
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "document", nullable = false)
	private Long doc;

	@ManyToOne
	private DocTypeEntity docType;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	private String mail;

	private Long phone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date startDate;

	@Column(columnDefinition="bit", updatable=false)
	private Boolean gender;
	
	@OneToMany
	private List<PatientEntity> patient;
	
	@OneToOne
	private UserEntity user;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<PatientEntity> getPatient() {
		return patient;
	}

	public void setPatient(List<PatientEntity> patient) {
		this.patient = patient;
	}

	public Long getId() {
		return id;
	}

	public Long getDoc() {
		return doc;
	}

	public void setDoc(Long doc) {
		this.doc = doc;
	}

	public DocTypeEntity getDocType() {
		return docType;
	}

	public void setDocType(DocTypeEntity docType) {
		this.docType = docType;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public DateTime getStartDate() {
		return new DateTime(startDate);
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate.toDate();
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}
}