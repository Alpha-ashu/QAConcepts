package Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_07CheckWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");  // For incognito browsing
        option.setExperimentalOption("useAutomationExtension", false);
        option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Corrected the typo
        
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        
        
        //check WebElement isDisplayed () : isEnabled() : isSelected() 
        WebElement searchStore = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
        System.out.println("Search Store field is Present: " + searchStore.isDisplayed() + " : " + searchStore.isEnabled()+ " : " +searchStore.isSelected());
    
	}

}
