package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String URL="https://petstore.octoperf.com/";
	public static final String STORE_URL="https://petstore.octoperf.com/actions/Catalog.action";
	private static final String ENTER_THE_STORE_LINK_XPATH="//a[contains(text(),'Enter the Store')]";
	
	// Method to get Store Link
	private static WebElement getStoreLink(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE_LINK_XPATH));
	}
	
	// Method to click Store Link
	public static void clickStoreLink(WebDriver driver) {
		getStoreLink(driver).click();
	}
	
}


