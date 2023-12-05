package springdata.projeto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springdata.projeto.dao.SpringDaoUser;
import springdata.projeto.model.Usuarios;

@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppTeste {
	
	@Autowired
	private SpringDaoUser userDao;
	
	
	
	@Test
	public void testInsert() {
		Usuarios user = new Usuarios();
		
		user.setNome("Wendel");
		user.setLogin("wssantos4");
		user.setEmail("wendelvoxs@gmail.com");		
		userDao.save(user);
		
	}
	@Test
	public void testeDelte() {
		userDao.deleteById(12L);
	}
	
	

}
