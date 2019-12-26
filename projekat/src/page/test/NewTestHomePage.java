package page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;

public class NewTestHomePage {
	@Test
	public void f() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = HomePage.URL;
		driver.get(url);

		String currUrl = driver.getCurrentUrl();
		sa.assertEquals(url, currUrl);
		
		//click
		HomePage.clickStoreLink(driver);
		String url2 = HomePage.STORE_URL;
		String currUrl2 = driver.getCurrentUrl();
		sa.assertEquals(url2, currUrl2);
		sa.assertAll();
	}
}
