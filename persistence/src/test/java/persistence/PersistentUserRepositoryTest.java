package persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.PersistentUser;
import com.mrgss.web.persistence.repository.UsersRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class PersistentUserRepositoryTest {
	
	@Autowired
	UsersRepository repository;
	
	@Test
	public void insertsNewCustomerCorrectly() {
		PersistentUser user = new PersistentUser();
		user.setName("Manuel");
		user.setPassword("322547");
		user = repository.save(user);
		assertNotNull(user.getId());
	}
	
}
