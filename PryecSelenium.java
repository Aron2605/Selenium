package clase.selenium;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Thread;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import Poms.pomJebus;

public class ayudameJebus {
	
			private String rolón;
			private WebDriver driver;
			private pomJebus google;
			private ChromeOptions options = new ChromeOptions();
	
	
			
			@Before
	
			public void setup() {

				
				
		options.addArguments("--disable-popup-blocking");
		//options.addArguments("--headless");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		
	}
	
	
			
			
	public void test() throws InterruptedException {
		
		//rolón = prompt("¿Qué quieres escuchar hoy?");
        Thread.sleep(10000);//Espera 10 segundos
       	// Goes to page
        
        google = new pomJebus(driver);
        driver.get("http://google.com");
        google.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Se identifica el elemento 
      	//WebElement firstResult = driver.findElement(By.xpath("//div[text()='Acepto']"));
      	//Se le da click al elemento
      	//firstResult.click();
      	// Searchs for desired item
        
        assertTrue(google.writeSearch("Youtube"));
		// Clicks first result
		assertTrue(google.clickFirstResult());
    	Thread.sleep(2000);//Espera 2 segundos
        //assertTrue(google.writeSearch2(rolón));
    	
        assertTrue(google.writeSearch2("Highway to Nowhere"));
    	Thread.sleep(2000);//Espera 2 segundos
		assertTrue(google.clickFirstResult2());
		
    	System.out.println(driver.getTitle());
    	Thread.sleep(20000);//Espera 20 segundos
		
    	
    	
    	
	}

	@After
	public void teardown() throws InterruptedException {
		
		
		
		Thread.sleep(20000);//Espera 20 segundos
		driver.quit();
		
		
		
	}

}
