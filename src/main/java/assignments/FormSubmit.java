package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormSubmit {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Sajina");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("Shajahan");
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("Saj");
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("Tvm");
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("691574");
		WebElement terms=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		terms.click();
		WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit form')]"));
		submit.click();
		WebElement msg=driver.findElement(By.xpath("//div[@id='message-one']"));
		String msgdisplay=msg.getText();
		System.out.println(msgdisplay);

	}

}
