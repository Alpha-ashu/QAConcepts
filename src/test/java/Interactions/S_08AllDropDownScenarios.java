package Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/* 
 * Select is class in selenium webdriver
 
 Types of dropdowns in web applications?
 * Select / div / ul tagname [parent]-> option / li [child ]
 * 1.Static Dropdown (Select Tag Dropdown)
 * 2.Dynamic Dropdown
 * 3.Multi-select Dropdown
 * 4.Auto-suggest/Auto-complete Dropdown
 
Methods in Select class
selectByIndex

selectByValue

selectByVisibleText

getOptions() – To return list of all the options(List<WebElement>).

getAllSelectedOptions() – To return the list of all the selected options(List<WebElement>).

getFirstSelectedOption() – To return the selected option or the first selected option in case of dropdowns allowing multi-select.

isMultiple() – To return a boolean value, check if the dropdown allows multiple options to select or not.

deselectAll() – To deselect all the selected options.

deselectByIndex(int index) – To deselect the option based on its index.

deselectByValue(String valueAttribute) – To deselect the option its ‘value’ attribute.

deselectByVisibleText(String text) – To deselect the option based on the text over the option.


*/
public class S_08AllDropDownScenarios {

	public static void main(String[] args) 
	{
		//WebDriver Setup
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		
		//Select a value From Static Dropdown
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select drop=new Select(dropdown);
		List<WebElement> dropValue=drop.getOptions();
		for(WebElement values : dropValue)
		{
			if (values.getText().equals("Computers & Accessories"))
			{
				values.click();
				String value=values.getText();
				System.out.println(value);
				break;
			}
		}
		drop.selectByIndex(2);
		drop.selectByValue("search-alias=audible");
		drop.selectByVisibleText("Books");
		
		//Select a Value from Dyanmic Dropdwon
		
		
	}

}
