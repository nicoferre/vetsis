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
@Table(name = "bill")
public class BillEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	private Date date;

	@OneToOne
	private ClientEntity client;
	
	@OneToOne
	private TypeOfBillsEntity typeOfBills;
	
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

	public TypeOfBillsEntity getTypeOfBills() {
		return typeOfBills;
	}

	public void setTypeOfBills(TypeOfBillsEntity typeOfBills) {
		this.typeOfBills = typeOfBills;
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
				+ ", typeOfBills=" + typeOfBills + ", total=" + total + "]";
	}
}