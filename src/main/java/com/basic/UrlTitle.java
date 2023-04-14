package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UrlTitle {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login.php");

			String url = driver.getCurrentUrl();
			String title=driver.getTitle();
			driver.manage().window().maximize();
			System.out.println("URL is: "+url );
			System.out.println("Title is:"+title);
			//driver.get(driver.getCurrentUrl());//refresh using get url method
	}

}
