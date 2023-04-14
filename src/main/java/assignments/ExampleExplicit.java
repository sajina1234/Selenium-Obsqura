package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleExplicit {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
	WebElement get=driver.findElement(By.xpath("//button[@id='save']"));
	get.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
	WebElement user=driver.findElement(By.xpath("//h5[@class='card-title']"));
	String text=user.getText();
	System.out.println(text);
	driver.close();
	}

}
