package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationsSample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");//wait until page loads
		driver.navigate().to("https://www.facebook.com/login.php");//will not wait until page loads but saves history
		driver.navigate().to("https://www.google.com");
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			driver.manage().window().maximize();
	}

}
