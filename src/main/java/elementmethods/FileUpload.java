package elementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.id("file-upload"));
		//choosefile.sendKeys("C:\\Users\\USER\\OneDrive\\Documents\\calculate.docx");
		File fileupload=new File("C:\\Users\\USER\\OneDrive\\Documents\\calculate.docx");//another method
		choosefile.sendKeys(fileupload.getAbsolutePath());
		String path=System.getProperty("user.dir");
				//C:\Users\USER\OneDrive\Desktop\eclipse\Selenium_obsqura
	System.out.println(path);
	}

}
