package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Examplemouseaction {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		Actions action=new Actions(driver);
		action.click(checkbox).build().perform();
		Thread.sleep(2000);
		WebElement message=driver.findElement(By.xpath("//div[contains(text(),'Success - Check box is checked')]"));
		String print=message.getText();
		System.out.println(print);
		driver.close();
		
		
	}

}
