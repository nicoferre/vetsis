package persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.RoleEntity;
import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.persistence.repository.RoleRepository;
import com.mrgss.web.persistence.repository.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class UserRepositoryTest {
	
	RoleEntity role;
	
	@Autowired
	UserRepository repositoryUser;
	
	@Autowired
	RoleRepository repositoryRole;
	
	@Before
	public void insertsNewRole() {
		role = new RoleEntity();
		role.setName("Administrador");
		role = repositoryRole.save(role);
		assertNotNull(role.getId());
	}
	
	@Test
	public void insertNewUser(){
		UserEntity user = new UserEntity();
		user.setActive(true);
		user.setPassword("manucomehombre");
		user.setUsername("nicoferre");
		user.setRole(role);
		user = repositoryUser.save(user);
		assertNotNull(user.getId());
	}
}
