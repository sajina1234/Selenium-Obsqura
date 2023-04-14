package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Searchtable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/table-filter.php");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("cara stevens");
		List<WebElement> searchresult = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		for (WebElement element : searchresult) {
			String print = element.getText();
			System.out.println(print);
		}

	}

}
