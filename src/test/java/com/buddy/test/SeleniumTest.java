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
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://34.93.120.219:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws Exception {
    	driver.get("http://34.93.73.51:8080/helloworld/");
        assertEquals("Demo Application - Landing Page", driver.getTitle());
    }

	//Error
	@Ignore
    @Test
    public void test2() throws Exception {
    	driver.get("http://34.93.73.51:8080/helloworld/");
        assertEquals("Demo Application - Landing Page", driver.getTitle());
    }

    @After
    public void tearDown() {
    	driver.quit();
    }

}
