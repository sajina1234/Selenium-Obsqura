package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocator {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement cart=driver.findElement(By.cssSelector("#nav-cart-count"));
			cart.click();//CSS selector by id (starts with #)
			
			WebElement signup=driver.findElement(By.cssSelector(".a-size-base-plus"));//Css selector by class(starts with . and replace all space with.)
			signup.click();
			

		
        
		
	}

}
