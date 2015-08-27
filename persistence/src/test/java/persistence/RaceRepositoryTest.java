package persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.RaceEntity;
import com.mrgss.web.persistence.repository.RaceRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class RaceRepositoryTest {
	
	@Autowired
	RaceRepository repository;
	
	@Test
	public void insertsRace() {
		RaceEntity race = new RaceEntity();
		race.setName("Labrador");
		race = repository.save(race);
		assertNotNull(race.getId());
	}
	
}
