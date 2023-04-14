package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableAssignment1 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr/th[2]"));
		String positiontext=position.getText();
		System.out.println(positiontext);
		WebElement sanfransisco=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]/td[3]"));
		String  text=sanfransisco.getText();
		System.out.println(text);
		driver.close();
		
	}

}
