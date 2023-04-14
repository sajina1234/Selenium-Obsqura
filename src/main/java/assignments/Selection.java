package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdown);
		select.selectByValue("Green");
		WebElement message=driver.findElement(By.id("message-one"));
		String textmsg=message.getText();
		System.out.println(textmsg);
		WebElement multiselect=driver.findElement(By.id("multi-select-field"));
		Select select1=new Select(multiselect);
		select1.selectByIndex(1);
		select1.selectByVisibleText("Green");
		WebElement firstbutton=driver.findElement(By.id("button-first"));
		firstbutton.click();
		WebElement message1=driver.findElement(By.id("message-two"));
		String buttonmsg=message1.getText();
		System.out.println(buttonmsg);
		WebElement buttonall=driver.findElement(By.className("button-all"));
		buttonall.click();
		driver.close();
		
		

	}

}
