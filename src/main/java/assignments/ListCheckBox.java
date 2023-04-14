package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListCheckBox {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkbox1.click();
		WebElement checkbox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		checkbox3.click();
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement element:list) {
			Boolean print=element.isSelected();
			System.out.println(print);
		}
	}

}
