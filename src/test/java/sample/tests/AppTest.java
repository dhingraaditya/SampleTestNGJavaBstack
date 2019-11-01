package sample.tests;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AppTest {

	
	
	@Test
	public void test() throws Exception {

		String username = System.getenv("BROWSERSTACK_USERNAME");
		String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
		String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
		String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("browser", "chrome");
		capabilities.setCapability("browserstack.local", browserstackLocal);
		capabilities.setCapability("browserstack.localIdentifier", browserstackLocalIdentifier);
		WebDriver driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
		driver.get("https://www.google.com");
		Thread.sleep(15000);
		driver.quit();
	}
}
