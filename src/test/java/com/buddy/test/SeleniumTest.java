package works.buddy.test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
	
	    
	/*final ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.setBinary("/usr/bin/chromium-browser");
chromeOptions.addArguments("--headless");
desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);    */
	  
	    
	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");    
	DesiredCapabilities capability = DesiredCapabilities.chrome();
        //capability.setCapability("headless", true);
        capability.setCapability("platform", "LINUX");
        capability.setCapability("version", "ANY");
	//capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);  
        //driver = new RemoteWebDriver(new URL("http://34.93.120.219:4444/wd/hub"), capability);
	driver = new RemoteWebDriver(new URL("http://34.93.123.206:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws Exception {
    	//driver.get("http://34.93.73.51:8080/helloworld/");
	driver.get("http://35.200.166.99:8081/hello2/");
        assertEquals("Demo Application - Landing Page", driver.getTitle());
    }

	//Error
	@Ignore
    @Test
    public void test2() throws Exception {
    	//driver.get("http://34.93.73.51:8080/helloworld/");
	driver.get("http://35.200.166.99:8081/hello2/");
        assertEquals("Demo Application - Landing Page", driver.getTitle());
    }

    @After
    public void tearDown() {
    	driver.quit();
    }

}
