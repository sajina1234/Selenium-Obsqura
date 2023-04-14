package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NegativeForm {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit form')]"));
		submit.click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		for(WebElement element:list) {
			String print=element.getText();
			System.out.println(print);
		}
		driver.close();

	}

}
