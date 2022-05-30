package Poms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pompompom {
	private String search = "//input[@name = 'q']";
	private String searchYout = "//input[@name = 'search_query']";
	private String link = "//h3[@class='LC20lb MBeuO DKV0Md']";
	private String linkYout = "//div[@class='style-scope ytd-video-renderer']";
	public WebDriver driver;

	public pompompom(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public boolean googIt(String searchValue) {
		boolean flag = false;
		try {
			WebElement input = driver.findElement(By.xpath(search));
			input.sendKeys(searchValue);
			input.sendKeys(Keys.ENTER);
			flag = true;
		} catch (Exception e) {
			System.out.println("Something went wrong :(");
			e.printStackTrace();
		}
		return flag;
	}

	public boolean yout(String searchValue) {
		boolean flag = false;
		try {
			WebElement input2 = driver.findElement(By.xpath(searchYout));
			input2.sendKeys(searchValue);
			input2.sendKeys(Keys.ENTER);
			flag = true;
		} catch (Exception e) {
			System.out.println("Something went wrong :(");
			e.printStackTrace();
		}
		return flag;
	}

	public boolean clickGoog() {
		boolean flag = false;
		try {
			WebElement firstResult = driver.findElement(By.xpath(link));
			firstResult.click();
			flag = true;
		} catch (Exception e) {
			System.out.println("Something went wrong :(");
			e.printStackTrace();
		}
		return flag;
	}

	public boolean clickYout() {
		boolean flag = false;
		try {
			WebElement firstResult = driver.findElement(By.xpath(linkYout));
			firstResult.click();
			flag = true;
		} catch (Exception e) {
			System.out.println("Something went wrong :(");
			e.printStackTrace();
		}
		return flag;
	}

}
