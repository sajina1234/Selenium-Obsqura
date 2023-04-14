package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dropdownlist {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		dropdown.click();
		List<WebElement> list=driver.findElements(By.xpath("//li[@aria-selected='false']"));
		for(WebElement element:list) {
			String listprint=element.getText();
			System.out.println(listprint);
			
		}
		driver.close();
	}

}
