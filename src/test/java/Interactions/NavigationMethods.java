package Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");  // For incognito browsing
        option.setExperimentalOption("useAutomationExtension", false);
        option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Corrected the typo
        
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.navigate().back();
        System.out.println("Back to Home Page");
        driver.navigate().refresh();
        System.out.println("Refer the Home Page");
        driver.navigate().forward();
        System.out.println("Forward to register page");
        driver.navigate().refresh();
        System.out.println("Referesh the register page");

	}

}
