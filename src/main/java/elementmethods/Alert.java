package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement alert1=driver.findElement(By.xpath("//button[contains(@onclick,'jsAlert()')]"));
		alert1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement alert2=driver.findElement(By.xpath("//button[contains(@onclick,'jsConfirm()')]"));
		alert2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		alert2.click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		WebElement alert3=driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]"));
		driver.switchTo().alert().sendKeys("test");
        Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
