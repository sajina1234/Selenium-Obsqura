package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Attributget {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\eclipse\\Selenium_obsqura\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement tooltip=driver.findElement(By.id("searchDropdownBox"));
			String tool=tooltip.getAttribute("title");
			System.out.println(tool);
			driver.get("https://demo.guru99.com/test/social-icon.html");
			WebElement mail=driver.findElement(By.xpath("//a[starts-with(@href,'https://forms.aweber.com/form/46/72')]"));
			String mailtool=mail.getAttribute("title");
			System.out.println(mailtool);
			WebElement google=driver.findElement(By.cssSelector(".fa.fa-lg.fa-google"));
			String googletool=google.getAttribute("title");
			System.out.println(googletool);
			WebElement youtube=driver.findElement(By.cssSelector(".fa.fa-lg.fa-youtube"));
			String youtubetool=youtube.getAttribute("title");
			System.out.println( youtubetool);
			driver.close();
	}

}
