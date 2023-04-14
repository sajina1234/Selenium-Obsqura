package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tooltip {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement facebook=driver.findElement(By.xpath("//div[@class='card-body']/a[1]"));
		String facebooktool=facebook.getAttribute("title");
		System.out.println(facebooktool);
		WebElement follow=driver.findElement(By.xpath("//a[contains(@id,'windowMulti')]"));
		String followtool=follow.getAttribute("title");
		System.out.println(followtool);
		driver.close();

	}

}
