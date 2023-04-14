package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxes {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		Boolean status1=checkbox1.isSelected();
		System.out.println(status1);
		Boolean checkstatus1=checkbox1.isDisplayed();
		System.out.println(checkstatus1);
		Boolean check1status=checkbox1.isEnabled();
		System.out.println(check1status);
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		Boolean status2=checkbox2.isSelected();
		System.out.println(status2);
		Boolean checkstatus2=checkbox2.isDisplayed();
		System.out.println(checkstatus2);
		Boolean check2status=checkbox2.isEnabled();
		System.out.println(check2status);
		String attribute=checkbox2.getAttribute("type");
		System.out.println(attribute);
		int a= checkbox1.getLocation().x;    //To get element location(elements are in x y format)
		System.out.println(a);
		int b=checkbox1.getLocation().y;
		System.out.println(b);
		String source=driver.getPageSource();  //to get html code
		System.out.println(source);
		if(!status1) {
			checkbox1.click();
			
		}
		if(!status2) {
			checkbox2.click();
			
		}
		driver.close();
	}

}
