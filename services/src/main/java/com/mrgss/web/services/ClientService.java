package com.mrgss.web.services;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgss.web.persistence.model.ClientEntity;
import com.mrgss.web.persistence.model.DocTypeEntity;
import com.mrgss.web.persistence.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repository;

	
	public ClientEntity newClient(DocTypeEntity docType, Long doc, String firstname, String lastname, String mail, Long phone, Boolean gender) {
		ClientEntity client = new ClientEntity();
		client.setDocType(docType);
		client.setDoc(doc);
		client.setFirstname(firstname);
		client.setLastname(lastname);
		client.setMail(mail);
		client.setPhone(phone);
		client.setGender(gender);
		client.setStartDate(DateTime.now());
		client = repository.save(client);
		return client;
	}
}
