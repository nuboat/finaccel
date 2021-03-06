package finaccel.facade;

import com.restfb.types.User;
import constant.Config;
import finaccel.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author nuboat
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class FbAuthenFacadeTest {
	
	@Autowired
	private FbAuthenFacade facade;
	
	@Test
	public void testAuthen() {
		final User user = facade.authen(Config.TOKEN_TEST);
		
		assert user != null : "User should not be null";
	}
	
}
