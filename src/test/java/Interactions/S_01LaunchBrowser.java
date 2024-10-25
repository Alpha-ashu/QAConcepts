package Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S_01LaunchBrowser {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
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
