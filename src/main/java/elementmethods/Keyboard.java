package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]//following::input[@id='twotabsearchtextbox']"));
		//search.sendKeys("laptop"+Keys.ENTER);
         search.sendKeys("laptop");
         search.sendKeys(Keys.BACK_SPACE);
        search.sendKeys((Keys.chord(Keys.CONTROL,"A")));
         WebElement all=driver.findElement(By.id("searchDropdownBox"));
         Actions action=new Actions(driver);
         action.moveToElement(all).build().perform();
         
	}

}
