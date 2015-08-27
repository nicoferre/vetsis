package persistence;

import static org.junit.Assert.assertNotNull;

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
import com.mrgss.web.persistence.model.RoleEntity;
import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.persistence.repository.ClientRepository;
import com.mrgss.web.persistence.repository.DocTypeRepository;
import com.mrgss.web.persistence.repository.RoleRepository;
import com.mrgss.web.persistence.repository.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class ClientRepositoryTest {
	
	DocTypeEntity docType;
	RoleEntity role;
	UserEntity user;
	@Autowired
	ClientRepository repositoryClient;
	
	@Autowired
	DocTypeRepository repositoryDocType;
	
	@Autowired
	UserRepository repositoryUser;
	
	@Autowired
	RoleRepository repositoryRole;
	
	@Before
	public void insertNewDocType() {
		docType = new DocTypeEntity();
		docType.setName("LC");
		docType = repositoryDocType.save(docType);
		assertNotNull(docType.getId());
		
		role = new RoleEntity();
		role.setName("Administrador");
		role = repositoryRole.save(role);
		assertNotNull(role.getId());
		
		user = new UserEntity();
		user.setActive(true);
		user.setPassword("manucomehombre");
		user.setUsername("nicoferre");
		user.setRole(role);
		user = repositoryUser.save(user);
		assertNotNull(user.getId());
	}
	
	@Test
	public void insertNewClient(){
		ClientEntity client = new ClientEntity();
		client.setFirstname("Nico");
		client.setLastName("Nicolas");
		client.setDoc(34574565L);
		client.setDocType(docType);
		client.setGender(true);
		client.setMail("asdsadsa2@asdsadasd.com");
		client.setPhone(3516536411L);
		client.setStartDate(DateTime.now());
		client.setUser(user);
		
		client = repositoryClient.save(client);
		assertNotNull(client);
	}
}