package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDemo {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
		String button=loginbutton.getText();
		System.out.println("text is :"+button);
		String Css=loginbutton.getCssValue("background-color");  ///getting css properties
		System.out.println(Css);
		WebElement dash=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
String dashtext=dash.getText();
System.out.println("Dashtext is:"+dashtext);
driver.get("https://demo.guru99.com/test/ajax.html");
driver.manage().window().maximize();
WebElement radio=driver.findElement(By.xpath("//input[@id='yes']"));
radio.click();
WebElement checkbutton=driver.findElement(By.id("buttoncheck"));
checkbutton.click();
WebElement checktext=driver.findElement(By.cssSelector(".radiobutton"));
String text=checktext.getText();
System.out.println("text is :"+text);
driver.close();
	}

}
