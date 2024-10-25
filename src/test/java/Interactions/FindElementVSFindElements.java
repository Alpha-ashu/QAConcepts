package Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--incognito");
//		option.setExperimentalOption("useAutomationExtension", false);
//		option.setExperimentalOption("exculdeSwitches", new String[] {"enabled-autoamtion"});
//		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		//Find Element -> Always return single WebElement 
		WebElement searchBox=driver.findElement(By.xpath("//*[@placeholder='Search store']"));
		searchBox.sendKeys("computers");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("done");
		
		//Even when we use over collection of Element with FindElement it will return only single WebElement in the 1st eg:
		WebElement footerLinks=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(footerLinks.getText());
		
		
		
		//driver.quit();

	}

}
