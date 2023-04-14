package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selected {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.id("gridCheck"));
		checkbox1.click();
		Boolean status=checkbox1.isSelected();
		System.out.println(status);
		Boolean statusdisplay=checkbox1.isDisplayed();
		System.out.println(statusdisplay);
		Boolean statusenabled=checkbox1.isEnabled();
		System.out.println(statusenabled);
		WebElement selectall=driver.findElement(By.xpath("//input[contains(@id,'button-two')]"));
		selectall.click();
		driver.close();
		
	}

}
