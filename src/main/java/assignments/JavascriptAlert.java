package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement alert1=driver.findElement(By.xpath("//button[contains(text(),'Click me!')]"));
		alert1.click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
