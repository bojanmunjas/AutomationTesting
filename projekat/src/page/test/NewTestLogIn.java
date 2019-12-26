package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;

public class NewTestLogIn {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void Login() {

		for (int i = 1; i < 51; i++) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(HomePage.STORE_URL);


			ExcelUtils.setExcell("MOCK_DATA (7).xlsx");
			ExcelUtils.setWorkSheet(0);

			String USER_ID, NEW_PASSWORD;

			double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
			int id1 = (int) id;
			USER_ID = String.valueOf(id1);

			NEW_PASSWORD = ExcelUtils.getDataAt(i, 1);

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
}
