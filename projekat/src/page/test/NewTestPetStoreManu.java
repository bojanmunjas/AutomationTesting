package page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreManu;

public class NewTestPetStoreManu {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void LeftMenuTest() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.STORE_URL);
		driver.manage().window().maximize();

		// Checking left fish menu link
		PetStoreManu.ClickLeftFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLFISH, currUrl);
		wait2();

		// Checking left dogs menu link
		driver.navigate().back();
		PetStoreManu.ClickLeftDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLDOG, currUrl);
		wait2();

		// Checking left cats menu link
		driver.navigate().back();
		PetStoreManu.ClickLeftCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLCATS, currUrl);
		wait2();

		// Checking left reptiles menu link
		driver.navigate().back();
		PetStoreManu.ClickLeftReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLREPTILES, currUrl);
		wait2();

		// Checking left birds menu link
		driver.navigate().back();
		PetStoreManu.ClickLeftBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLBIRDS, currUrl);
		wait2();

		sa.assertAll();
		driver.close();

	}

	@Test
	public void TopMenuTest() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.STORE_URL);
		driver.manage().window().maximize();

		// Checking top fish menu link
		PetStoreManu.ClickTopFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLFISH, currUrl);
		wait2();

		// Checking top dogs menu link
		driver.navigate().back();
		PetStoreManu.ClickTopDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLDOG, currUrl);
		wait2();

		// Checking top cats menu link
		driver.navigate().back();
		PetStoreManu.ClickTopCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLCATS, currUrl);
		wait2();

		// Checking top reptiles menu link
		driver.navigate().back();
		PetStoreManu.ClickTopReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLREPTILES, currUrl);
		wait2();

		// Checking top birds menu link
		driver.navigate().back();
		PetStoreManu.ClickTopBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLBIRDS, currUrl);
		wait2();

		sa.assertAll();
		driver.close();

	}

	@Test
	public void PictureMenuTest() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.STORE_URL);
		driver.manage().window().maximize();

		// Checking Picture fish menu link
		PetStoreManu.ClickPicFish(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLFISH, currUrl);
		wait2();

		// Checking Picture dogs menu link
		driver.navigate().back();
		PetStoreManu.ClickPicDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLDOG, currUrl);
		wait2();

		// Checking Picture cats menu link
		driver.navigate().back();
		PetStoreManu.ClickPicCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLCATS, currUrl);
		wait2();

		// Checking Picture reptiles menu link
		driver.navigate().back();
		PetStoreManu.ClickPicReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLREPTILES, currUrl);
		wait2();

		// Checking Picture birds menu link
		driver.navigate().back();
		PetStoreManu.ClickPicBirds(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLBIRDS, currUrl);
		wait2();

		// Checking Picture birds1 menu link
		driver.navigate().back();
		PetStoreManu.ClickPicBirds1(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLBIRDS, currUrl);
		wait2();
		sa.assertAll();
		driver.close();

	}

	@Test
	public void SignInButtonTest() {
		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.STORE_URL);
		driver.manage().window().maximize();

		// Checking Sing in button link
		PetStoreManu.ClickSignInButton(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStoreManu.URLSIGNIN, currUrl);
		wait2();

	}
}
