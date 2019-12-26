package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;

public class NewTestCart {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
  @Test
  public void TestCart() {
	  int i = 1;

	    SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(HomePage.STORE_URL);

		

		String USER_ID = "bane";
		String PASSWORD = "bane123";;
		
		//LOGIN
		wait2();
		SignIn.clickSignInButton(driver);
		wait2();

		SignIn.sendKeysUser(driver, USER_ID);
		SignIn.getPass(driver).clear();
		SignIn.sendKeysPass(driver, PASSWORD);
		wait2();
		SignIn.clickLogInButton(driver);
		
		PetStoreManu.ClickTopCats(driver);
		
		Registration.clickPersianCat(driver);
		Registration.clickPersianCatMale(driver);
		Registration.clickAddPersianCatMale(driver); 
		
		boolean currentCat = driver.findElement(By.xpath(Registration.EST_17_PERSIAN_CAT_XPATH)).isDisplayed();

		Assert.assertTrue(currentCat);

		SignIn.clickLogOutButton(driver);

		driver.quit(); 	  
}
}
  

