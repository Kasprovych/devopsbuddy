package ua.devopsbuddy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ua.devopsbuddy.web.i18n.I18NService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DevopsbuddyApplication.class)
@WebAppConfiguration
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18NService i18NService;


	@Test
	public void testMassageByLocaleService()throws Exception {
		String expectedResult = "This example adds a dropdown menu in the navbar";
		String messagesId = "index.main.callout";
		String actual = i18NService.getMessage(messagesId);
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
	}

}
