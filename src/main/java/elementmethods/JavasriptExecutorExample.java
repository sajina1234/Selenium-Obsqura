package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JavasriptExecutorExample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		//js.executeScript("alert('sajina')");
		WebElement money=driver.findElement(By.xpath("//div[contains(text(),'Make Money with Us')]"));
		js.executeScript("arguments[0].scrollIntoView();",money);
		//js.executeScript("arguments[0].click();",element);//javascript click
		        //to press particular key
				//Actions actions = new Actions(driver);
				//actions.keyPress(Keys.ENTER).build().perform();
	}

}
