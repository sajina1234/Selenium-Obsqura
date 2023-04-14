package MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Buttonaction {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		action.contextClick().build().perform();
//		action.contextClick(click).build().perform();
		WebElement rightclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions action=new Actions(driver);
		//action.doubleClick().build().perform();
//		action.doubleClick(rightclick).build().perform();
//		driver.switchTo().alert().accept();

		WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
//		action.contextClick(click).build().perform();
//		action.moveToElement(copy).build().perform();
//		action.click().build().perform();
//		driver.switchTo().alert().accept();
		/////second method///
		action.contextClick(click).build().perform();
		action.click(copy).build().perform();
		driver.switchTo().alert().accept();
        
	}

}
