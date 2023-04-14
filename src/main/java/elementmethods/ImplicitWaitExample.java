package elementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement startmsg=driver.findElement(By.xpath("//div[@id='finish']/h4"));
		String msg=startmsg.getText();
		System.out.println(msg);
		driver.close();

	}

}
