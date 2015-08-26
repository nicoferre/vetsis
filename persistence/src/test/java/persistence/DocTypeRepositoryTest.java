package persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mrgss.web.persistence.model.DocTypeEntity;
import com.mrgss.web.persistence.repository.DocTypeRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration("/spring-jpa-config.xml")
public class DocTypeRepositoryTest {
	
	@Autowired
	DocTypeRepository repository;
	
	@Test
	public void insertsNewCustomerCorrectly() {
		DocTypeEntity docType = new DocTypeEntity();
		docType.setName("LC");
		docType = repository.save(docType);
		assertNotNull(docType.getId());
	}
	
}
