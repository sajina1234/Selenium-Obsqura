package elementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableDemo {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]/th[3]"));
		String officetext=office.getText();
		System.out.println(officetext);
		WebElement salary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]/th[6]"));
		String salarytext=salary.getText();
		System.out.println(salarytext);
		WebElement namedata=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]/td[1]"));
		String name=namedata.getText();
		System.out.println(name);
		WebElement officedata=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]/td[3]"));
		String text=officedata.getText();
		System.out.println(text);
		/////printing column data
		List<WebElement> dataname=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr/td[1]"));
		for(WebElement Element:dataname) {
			String print=Element.getText();
			System.out.println(print);
		}
		///////printing rowdata////
		List <WebElement> row=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]/td"));
		for(WebElement elements:row) {
			String rowdata=elements.getText();
			System.out.println(rowdata);
		}
				driver.close();

	}

}
