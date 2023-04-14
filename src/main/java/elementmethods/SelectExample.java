package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement alldropdown=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		Select select=new Select(alldropdown);
		//select.selectByIndex(3);
		//select.selectByValue("search-alias=baby");
		select.selectByVisibleText("Beauty");
	
	
		

	}

}
