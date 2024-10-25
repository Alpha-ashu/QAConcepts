package Interactions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        //option.addArguments("--headless"); // Uncomment this line for headless mode if needed
        option.addArguments("--incognito");  // For incognito browsing
        option.setExperimentalOption("useAutomationExtension", false);
        option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Corrected the typo
        
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        
        /*
        String title=driver.getTitle();
        String pageSource=driver.getPageSource();
        String currentURL=driver.getCurrentUrl();
        
        System.out.println(title);
        System.out.println(pageSource);
        System.out.println(currentURL);
        */
        
     }
}
