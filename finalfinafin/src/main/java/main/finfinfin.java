package main;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.lang.Thread;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import Poms.pompompom;

public class finfinfin {
	private String jam;
	private WebDriver driv;
	private pompompom goo;
	private ChromeOptions opc = new ChromeOptions();
	@Before
	public void setup() {
		//opc.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		driv = new ChromeDriver(opc);
	}
	@Test
	public void test() throws InterruptedException {
		Scanner read = new Scanner (System.in);
		System.out.print("Introduzca su búsqueda");
		String jam = read.next();
		Thread.sleep(1000);
		goo = new pompompom(driv);
		driv.get("http://google.com");
		goo.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertTrue(goo.googIt("Youtube"));
		assertTrue(goo.clickGoog());
		Thread.sleep(2000);
		assertTrue(goo.yout(jam));
		Thread.sleep(2000);
		assertTrue(goo.clickYout());
		Thread.sleep(20000);
		System.out.println(driv.getTitle());
		Thread.sleep(1000);
	}
	@After
	public void teardown() {
		driv.quit();
	}
	public String getJam() {
		return jam;
	}
	public void setJam(String jam) {
		this.jam = jam;
	}
}
