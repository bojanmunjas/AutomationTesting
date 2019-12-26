package page.main;

import java.util.Scanner;

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
import page.test.NewTestCart;
import page.test.NewTestHomePage;

public class main {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void PetStoreTests() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = HomePage.URL;
		driver.get(url);
		HomePage.clickStoreLink(driver);
		String USER_ID = "bane";
		String PASSWORD = "bane123";
		;

		// LOGIN
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
