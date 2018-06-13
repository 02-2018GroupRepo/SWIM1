package com.capstone.swimServer;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;


@SpringBootTest
public class SwimServerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void homePageLoads(){

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","../../../chromedriver.exe");
		driver = new ChromeDriver();
		// Navigate to home page.
		driver.get("https://www.thd-swim.site/");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		// Makes sure the "SWIM DASHBOARD" section is displayed
		wait.until(findDashboard -> driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/p"))).isDisplayed();
		driver.quit();
	}

	@Test
	public void userCanLogin(){

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shahar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thd-swim.site/");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		// Waits until it finds the username and password sections. Then enters in credentials.
		wait.until(typeUsername -> driver.findElement(By.xpath("//*[@id=\"username\"]"))).sendKeys("1");
		wait.until(typePassword -> driver.findElement(By.xpath("//*[@id=\"pwd\"]"))).sendKeys("1");
		// Waits until login button appears. Clicks log in button.
		wait.until(login -> driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/button"))).click();
		// looks for "Receiving" button on next page being clickable
 		wait.until(doesReceivingButtonLoad -> driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/button[1]"))).isEnabled();
		driver.quit();
	}

}
