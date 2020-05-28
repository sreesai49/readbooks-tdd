package config;

import org.openqa.selenium.WebDriver;

public class testSetUpFactory {
	
	public WebDriver driver;
	public String currentDir = System.getProperty("user.dir");
//	System.setProperty("webdriver.chrome.driver", currentDir+"/drivers/chromedriver");
	
	public testSetUpFactory() {
		System.setProperty("webdriver.chrome.driver", currentDir+"/drivers/chromedriver");
	}

}
