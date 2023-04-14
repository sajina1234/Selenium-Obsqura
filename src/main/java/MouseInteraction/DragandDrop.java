package MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement target=driver.findElement(By.xpath("//ol[@id='amt7']"));
		//WebElement target=driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).build().perform();
	
		
		
	}

}
