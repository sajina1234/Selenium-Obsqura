package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Elementslist {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> dataposition=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr/td[2]")); 
		for(WebElement element :dataposition) {
			String data=element.getText();
			System.out.println(data);
		}
		List <WebElement> rowdata=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]/td"));
		for(WebElement row:rowdata) {
			String fields=row.getText();
			System.out.println(fields);
		}
		driver.close();
	}

}
