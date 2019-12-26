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

public class NewTestRegistration {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void TestRegistrationUsersFromExcel() {
		for (int i = 1; i < 51; i++) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(Registration.REGISTRATION_URL);
			driver.manage().window().maximize();
			ExcelUtils.setExcell("MOCK_DATA (7).xlsx");
			ExcelUtils.setWorkSheet(0);
			String USER_ID, NEW_PASSWORD, REPEAT_PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS1, ADDRESS2,
					CITY, STATE, ZIP, COUNTRY, LANGUAGE_PREFERENCE, FAVOURITE_CATEGORY;

			double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
			int id1 = (int) id;
			USER_ID = String.valueOf(id1);
			NEW_PASSWORD = ExcelUtils.getDataAt(i, 1);
			REPEAT_PASSWORD = ExcelUtils.getDataAt(i, 1);
			FIRST_NAME = ExcelUtils.getDataAt(i, 2);
			LAST_NAME = ExcelUtils.getDataAt(i, 3);
			EMAIL = ExcelUtils.getDataAt(i, 4);
			PHONE = ExcelUtils.getDataAt(i, 5);
			ADDRESS1 = ExcelUtils.getDataAt(i, 6);
			ADDRESS2 = ExcelUtils.getDataAt(i, 7);
			CITY = ExcelUtils.getDataAt(i, 8);
			STATE = ExcelUtils.getDataAt(i, 9);
			double z = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
			int z1 = (int) z;
			ZIP = String.valueOf(z1);
			COUNTRY = ExcelUtils.getDataAt(i, 11);
			LANGUAGE_PREFERENCE = "japanese";
			FAVOURITE_CATEGORY = "DOGS";

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get(Registration.REGISTRATION_URL);
			Registration.sendKeysUserId(driver, USER_ID);
			Registration.sendKeysNewPassword(driver, NEW_PASSWORD);
			Registration.sendKeysRepeatpassword(driver, REPEAT_PASSWORD);
			wait2();
			Registration.sendKeysFirstName(driver, FIRST_NAME);
			Registration.sendKeysLastName(driver, LAST_NAME);
			Registration.sendKeysEmail(driver, EMAIL);
			Registration.sendKeysPhone(driver, PHONE);
			Registration.sendKeysAddress1(driver, ADDRESS1);
			Registration.sendKeysAddress2(driver, ADDRESS2);
			Registration.sendKeysCity(driver, CITY);
			Registration.sendKeysState(driver, STATE);
			Registration.sendKeysZip(driver, ZIP);
			Registration.sendKeysCountry(driver, COUNTRY);
			wait2();
			Registration.inputLanguage(driver, LANGUAGE_PREFERENCE);
			Registration.inputCategory(driver, FAVOURITE_CATEGORY);
			Registration.clickEnableMyList(driver);
			Registration.clickEnableMyBanner(driver);
			wait2();
			Registration.clickSaveAccount(driver);
			wait2();
			PetStoreManu.ClickSignInButton(driver);

			SignIn.sendKeysUser(driver, USER_ID);
			SignIn.clearPass(driver);
			SignIn.sendKeysPass(driver, NEW_PASSWORD);
			wait2();
			SignIn.clickLogInButton(driver);

			boolean currentHeading = driver.findElement(By.xpath(Registration.MY_ACCOUNT_LINK)).isDisplayed();

			SoftAssert sa = new SoftAssert();
			sa.assertTrue(currentHeading);

			wait2();
			SignIn.clickLogOutButton(driver);

			driver.quit();
			sa.assertAll();
		}
	}
@Test
	
	// Test for registering single manually entered user
	
	public void TestOneUser() { 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.REGISTRATION_URL);
		driver.manage().window().maximize();

		wait2();

		String USER_ID, NEW_PASSWORD, REPEAT_PASSWORD, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS1, ADDRESS2, CITY,
				STATE, ZIP, COUNTRY, LANGUAGE_PREFERENCE, FAVOURITE_CATEGORY;

		USER_ID = "1232";
		NEW_PASSWORD = "dasdasdas";
		REPEAT_PASSWORD = "dasdasdas";
		FIRST_NAME = "Bojan";
		LAST_NAME = "Munjas";
		EMAIL = "bojanmunjas@gmail.com";
		PHONE = "(381) 0646496470";
		ADDRESS1 = "Sljivarska 3v";
		ADDRESS2 = "Sljivarska 3v";
		CITY = "Beograd";
		STATE = "Srbija";
		ZIP = "11221";
		COUNTRY = "Srbija";
		LANGUAGE_PREFERENCE = "japanese";
		FAVOURITE_CATEGORY = "DOGS";

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Registration.sendKeysUserId(driver, USER_ID);
		Registration.sendKeysNewPassword(driver, NEW_PASSWORD);
		Registration.sendKeysRepeatpassword(driver, REPEAT_PASSWORD);
		wait2();
		Registration.sendKeysFirstName(driver, FIRST_NAME);
		Registration.sendKeysLastName(driver, LAST_NAME);
        Registration.sendKeysEmail(driver, EMAIL);
		Registration.sendKeysPhone(driver, PHONE);
		Registration.sendKeysAddress1(driver, ADDRESS1);
		Registration.sendKeysAddress2(driver, ADDRESS2);
		Registration.sendKeysCity(driver, CITY);
		Registration.sendKeysState(driver, STATE);
		Registration.sendKeysZip(driver, ZIP);
		Registration.sendKeysCountry(driver, COUNTRY);
		wait2();
		Registration.inputLanguage(driver, LANGUAGE_PREFERENCE);
		Registration.inputCategory(driver, FAVOURITE_CATEGORY);
		Registration.clickEnableMyList(driver);
		Registration.clickEnableMyBanner(driver);
		wait2();
		Registration.clickSaveAccount(driver);
		wait2();

		wait2();

		PetStoreManu.ClickSignInButton(driver);
		wait2();
		SignIn.sendKeysUser(driver, USER_ID);
		SignIn.clearPass(driver);
		SignIn.sendKeysPass(driver, NEW_PASSWORD);
		wait2();
		SignIn.clickLogInButton(driver);
		wait2();
		boolean currentHeading = driver.findElement(By.xpath(Registration.MY_ACCOUNT_LINK)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		wait2();
		SignIn.clickLogOutButton(driver);

		driver.quit();
		sa.assertAll();
	}
}
