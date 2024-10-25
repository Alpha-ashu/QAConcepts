package Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_06GetTextVSGetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		//GetText() 
		driver.findElement(By.className("ico-login")).click();
		WebElement username=driver.findElement(By.className("email"));
		username.sendKeys("Shaik.job.details@gmail.com");
		String paragraph=driver.findElement(By.className("topic-block-body")).getText();
		System.out.println(paragraph);
		
		//GetAttribute
		String value=username.getAttribute("data-val-required");
		System.out.println(value);
		
		
		//getText() will return the inner text in element and getAttribute() will return the attribute value both return type will string
		WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(login.getText());
		System.out.println(login.getAttribute("type"));

	}

}
