package Interactions;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S_02DisableBrowserLevelPOPUP {
	public static void main(String[] args) {
		// Setup WebDriverManager for Chrome
		WebDriverManager.chromedriver().setup();

		// ChromeOptions setup with location preference
		ChromeOptions options = new ChromeOptions();
		// using HashMap we can able to manage the browser level pop-up like
		// { geolocation, notifications , medtia_Stream, cookies, images, javascript,
		// plugins, popups}
		Map<String, Integer> contentSetting = new HashMap<>();
		contentSetting.put("notifications", 2);// 0 Means always allow
												// 1 Means allow
												// 2 Means block // this are the values in popup
		contentSetting.put("popups", 2);
		Map<String, Object> profile = new HashMap<>();
		profile.put("manage_default_content_settings", contentSetting);
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

//      //Add preferences and disable popup blocking
//      Map<String, Object> prefs = new HashMap<>();
//      prefs.put("profile.default_content_setting_values.geolocation", 2); 
//      prefs.put("profile.default_content_setting_values.notifications", 2);
//      options.setExperimentalOption("prefs", prefs);

//      //Same but its from ChromeOption Class
//      options.addArguments("--disable-popup-blocking"); // Block unexpected popups
//      options.addArguments("--disable-geolocation"); // Disable geolocation in general
//		option.addArguments("--headless");//Run the test execute without opening the Browser
//		option.addArguments("--incognito");//Run the Browser in Incognito Mode
//		option.addArguments("--start-maximized"); Open the Browser in Maximized
//		option.addArguments("--disable-infobars"); 

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
//		driver.get("https://www.cleartrip.com/");
//		driver.get("https://web-push-book.gauntface.com/d...");
//		driver.get("https://whatmylocation.com/");
//		driver.get("https://mictests.com/");
//		driver.get("https://webcamtests.com/");
		driver.get("https://whatmylocation.com/");
	}
}
