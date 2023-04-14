package elementmethods;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWaitExample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		Wait wait = new FluentWait(driver)
		  .withTimeout(Duration.ofSeconds(20))
		   .pollingEvery(Duration.ofSeconds(30))
		   .ignoring(Exception.class);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']")));
	}

}
