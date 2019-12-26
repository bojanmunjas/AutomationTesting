package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;

public class NewTestAccountChange {
		public static void wait2() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
  @Test
  public void TestAccountChange() {
	  SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(SignIn.LOG_IN_URL);
		driver.manage().window().maximize();
		String USER_ID = "bane";
		String PASSWORD = "bane123";
		SignIn.getUser(driver).clear();
		SignIn.sendKeysUser(driver, USER_ID);
		SignIn.getPass(driver).clear();
		SignIn.sendKeysPass(driver, PASSWORD);
		wait2();
		SignIn.clickLogInButton(driver);
		wait2();
		boolean ExistSignOut = driver.findElement(By.xpath(PetStoreManu.SIGNOUT_BUTTON)).isDisplayed();

		sa.assertEquals(ExistSignOut, true, "Log In Unsuccesful!");
		
		PetStoreManu.clickMyAccButton(driver);
		
		Registration.getPhone(driver).clear();
		Registration.sendKeysPhone(driver, "(381) 123123");
		Registration.getCountry(driver).clear();
		Registration.sendKeysCountry(driver, "Srbija");
	
		wait2();
		Registration.clickChangeAccountInfo(driver);
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		SignIn.clickLogOutButton(driver);
		wait2();
		SignIn.clickSignInButton(driver);
		SignIn.getUser(driver).clear();
		SignIn.sendKeysUser(driver, USER_ID);
		SignIn.getPass(driver).clear();
		SignIn.sendKeysPass(driver, PASSWORD);
		SignIn.clickLogInButton(driver);
		PetStoreManu.clickMyAccButton(driver);
		
		String phone = driver.findElement(By.xpath("//input[@name='account.phone']")).getText();
		String country = driver.findElement(By.xpath("//input[@name='account.country']")).getText();
		
		sa.assertEquals(phone,  "(381) 123123");
		sa.assertEquals(country,  "Srbija");
		
		
		wait2();
		
		sa.assertAll();
		driver.close();
		
		
		
		
		
		
		
		
		
  }
}
