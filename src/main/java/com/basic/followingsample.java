package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class followingsample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]//following::input[@id='twotabsearchtextbox']"));
		search.sendKeys("laptop");
		WebElement searchbutton=driver.findElement(By.cssSelector("#nav-search-submit-button"));
		searchbutton.click();
		driver.close();

	}

}
