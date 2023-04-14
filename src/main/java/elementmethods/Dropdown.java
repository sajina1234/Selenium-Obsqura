package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.className("select2-selection__rendered"));
		drop.click();
		WebElement field=driver.findElement(By.className("select2-search__field"));
		String state="Hawaii";
		//field.sendKeys("California");
		WebElement selection=driver.findElement(By.xpath("//li[text()='"+state+"']"));
		selection.click();

	}

}
