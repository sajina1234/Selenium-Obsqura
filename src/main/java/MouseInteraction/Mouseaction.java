package MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		WebElement image1=driver.findElement(By.xpath("//div[@class='figure']/img[@alt='User Avatar']"));
		Actions action=new Actions(driver);
		action.moveToElement(image1, 0, 0).build().perform();
		//or//action.moveToElement(image1).build().perform();
		

	}

}
