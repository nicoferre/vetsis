package persistence;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.ClientEntity;
import com.mrgss.web.persistence.model.DocTypeEntity;
import com.mrgss.web.persistence.model.PatientEntity;
import com.mrgss.web.persistence.model.RaceEntity;
import com.mrgss.web.persistence.model.SpeciesEntity;
import com.mrgss.web.persistence.repository.ClientRepository;
import com.mrgss.web.persistence.repository.DocTypeRepository;
import com.mrgss.web.persistence.repository.PatientRepository;
import com.mrgss.web.persistence.repository.RaceRepository;
import com.mrgss.web.persistence.repository.SpeciesRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class PatientRepositoryTest {
	
	DocTypeEntity docType;
	ClientEntity client;
	RaceEntity race;
	List<RaceEntity> listRace= new ArrayList<RaceEntity>();
	
	@Autowired
	ClientRepository repositoryClient;
	
	@Autowired
	DocTypeRepository repositoryDocType;
	
	@Autowired
	PatientRepository repositoryPatient;
	
	@Autowired
	RaceRepository repositoryRace;
	
	@Autowired
	SpeciesRepository repositorySpecies;
	
	@Before
	public void insertNewDocTypeAndClient() {
		docType = new DocTypeEntity();
		docType.setName("LC");
		docType = repositoryDocType.save(docType);
		assertNotNull(docType.getId());
		
		client = new ClientEntity();
		client.setFirstname("Nico");
		client.setLastName("Nicolas");
		client.setDoc(34574565L);
		client.setDocType(docType);
		client.setGender(true);
		client.setMail("asdsadsa2@asdsadasd.com");
		client.setPhone(3516536411L);
		client.setStartDate(DateTime.now());
		
		client = repositoryClient.save(client);
		assertNotNull(client.getId());
		
		race = new RaceEntity();
		race.setName("Labrador");
		race = repositoryRace.save(race);
		listRace.add(race);
		assertNotNull(race.getId());
		
		SpeciesEntity species = new SpeciesEntity();
		species.setName("CANINO");
		species.setRaces(listRace);
		species.setStartDate(DateTime.now());
		species = repositorySpecies.save(species);
		assertNotNull(species.getId());
	}
	
	@Test	
	public void insertNewPatient(){
		PatientEntity patient = new PatientEntity();
		patient.setClient(client);
		patient.setBirthday(DateTime.now());
		patient.setName("Manuel");
		patient.setStartDate(DateTime.now());
		patient.setRace(listRace.get(0));
	}
	
}