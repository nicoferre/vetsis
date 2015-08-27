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

import com.mrgss.web.persistence.model.RaceEntity;
import com.mrgss.web.persistence.model.SpeciesEntity;
import com.mrgss.web.persistence.repository.RaceRepository;
import com.mrgss.web.persistence.repository.SpeciesRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class SpeciesRepositoryTest {
	
	RaceEntity race;
	List<RaceEntity> listRace= new ArrayList<RaceEntity>();
	
	@Autowired
	SpeciesRepository repository;
	
	@Autowired
	RaceRepository repositoryRace;
	
	@Before
	public void insertsRace() {
		race = new RaceEntity();
		race.setName("Labrador");
		race = repositoryRace.save(race);
		listRace.add(race);
		assertNotNull(race.getId());
	}
	
	@Test
	public void insertsNewSpecies() {
		SpeciesEntity species = new SpeciesEntity();
		species.setName("CANINO");
		species.setRaces(listRace);
		species.setStartDate(DateTime.now());
		species = repository.save(species);
		assertNotNull(species.getId());
	}
	
}
