package elementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Elements {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		List<WebElement> tab=driver.findElements(By.xpath("//ul[@class='navbar-nav']/li/a"));
		System.out.println(tab.size());
//		for(int x=0;x<tab.size();x++) {
//			String text=tab.get(x).getText();
//			System.out.println(text);
//		}
		for(WebElement element:tab)
		{
			String print=element.getText();
			System.out.println(print);
		}

	}

}
