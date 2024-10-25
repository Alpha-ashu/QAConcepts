package Interactions;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_03BrowserLevelSettings {

	public static void main(String[] args) {
		/*
		 * 1.Stable Environment Setup: Ensure Chrome and ChromeDriver versions are
		 * 2.compatible. ChromeOptions Configuration: Disable popups, notifications, Geo location requests, maximize browser, and use incognito mode. 
		 * 3.DevTools Protocol for advanced permissions, network throttling, and
		 * 4.Geo location control. Timeout and Wait Management: Use implicit and explicit
		 * 5.waits to handle dynamic elements. Browser Cleanup: Clear cookies and close
		 * 6.drivers after each test session to avoid session issues.
		 */

		// 1. WebDriver setup
		WebDriverManager.chromedriver().setup();
		
		//2. ChromeOptions
		ChromeOptions option = new ChromeOptions();
		
		option.setExperimentalOption("useAutoamtionExtension", false);
		option.setExperimentalOption("exculdeSwitches",new String[] {"enable-autoamtion"});
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.spicejet.com");
	}

}
