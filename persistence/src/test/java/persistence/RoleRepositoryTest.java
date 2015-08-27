package persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.RoleEntity;
import com.mrgss.web.persistence.repository.RoleRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class RoleRepositoryTest {
	
	@Autowired
	RoleRepository repository;
	
	@Test
	public void insertsNewRole() {
		RoleEntity role = new RoleEntity();
		role.setName("Administrador");
		role = repository.save(role);
		assertNotNull(role.getId());
	}
	
}
