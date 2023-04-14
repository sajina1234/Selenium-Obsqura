package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calculate {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement field1=driver.findElement(By.id("value-a"));
		field1.sendKeys("3");
		WebElement field2=driver.findElement(By.id("value-b"));
		field2.sendKeys("2");
		WebElement button=driver.findElement(By.id("button-two"));
		button.click();
		WebElement message=driver.findElement(By.id("message-two"));
		String text=message.getText();
		System.out.println(text);
		driver.close();
		
		
	}

}
