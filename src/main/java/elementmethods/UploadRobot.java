package elementmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UploadRobot {

	public static void main(String[] args) throws AWTException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.id("file-upload"));
		//("C:\\Users\\USER\\OneDrive\\Documents\\calculate.docx");
		String path="C:\\Users\\USER\\OneDrive\\Documents\\calculate.docx";
		Actions action=new Actions(driver);
		action.moveToElement(choosefile).click().build().perform();
		Robot robot=new Robot();
		
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
