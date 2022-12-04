
package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static  WebDriver driver;

	@Test
	public void fun() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String title = driver.getTitle();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));

		textBox.sendKeys("Selenium");
		submitButton.click();

		WebElement message = driver.findElement(By.id("message"));
		String value = message.getText();

		System.out.println("Value->  " + value);

		driver.quit();

	}
	
	@Test
	public void printText() {
		System.out.println("*********************** Hi printText method executed *************************");
	}

}
