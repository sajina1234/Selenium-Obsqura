package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleContains {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login.php");
		WebElement email=driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
		email.sendKeys("test");
		WebElement password=driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
		driver.manage().window().maximize();
		driver.close();

	}

}
