package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyCss {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
		String Css=loginbutton.getCssValue("background-color");  ///getting css properties
		System.out.println(Css);
		String Color=loginbutton.getCssValue("color");  
		System.out.println(Color);
		String font=loginbutton.getCssValue("font-size");  
		System.out.println(font);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//a[contains(text(),'Sign in securely')]"));
		String signing=sign.getCssValue("Color");
		System.out.println(signing);
		

	}

}
