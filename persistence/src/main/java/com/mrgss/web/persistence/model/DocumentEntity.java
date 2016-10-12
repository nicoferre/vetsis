package com.mrgss.web.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "documents")
public class DocumentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date date;

	@OneToOne
	private ClientEntity client;
	
	@OneToOne
	private TypeOfDocumentsEntity typeOfDocuments;
	
	private Long total;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ClientEntity getClient() {
		return client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
	}

	public TypeOfDocumentsEntity getTypeOfDocuments() {
		return typeOfDocuments;
	}

	public void setTypeOfBills(TypeOfDocumentsEntity typeOfDocuments) {
		this.typeOfDocuments = typeOfDocuments;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BillEntity [id=" + id + ", date=" + date + ", client=" + client
				+ ", typeOfDocuments=" + typeOfDocuments + ", total=" + total + "]";
	}
}