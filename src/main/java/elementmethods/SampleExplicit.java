package elementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleExplicit {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebElement Start=driver.findElement(By.xpath("//button[@id='downloadButton']"));

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='downloadButton']")));
	Start.click();
	WebElement CancelDownload = driver.findElement(By.xpath("//button[text()='Cancel Download']"));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Cancel Download']")));
	System.out.println("hai");
	driver.quit();
	}

}
