package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreManu {
	public static final String URLFISH="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String URLDOG="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String URLCATS="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String URLREPTILES="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String URLBIRDS="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String URLSIGNIN="https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	private static final String SIGNIN_BUTTON = "//a[contains(text(),'Sign In')]";
	private static final String MYACC_BUTTON = "//a[contains(text(),'My Account')]";
	public static final String SIGNOUT_BUTTON = "//a[contains(text(),'Sign Out')]";
	private static final String CART_BUTTON = "//img[@name='img_cart']";
	
	public static WebElement getSignInButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_BUTTON));
	}

	public static void clickSignInButton(WebDriver driver) {
		getSignInButton(driver).click();
	}
	
	public static WebElement getMyAccButton(WebDriver driver) {
		return driver.findElement(By.xpath(MYACC_BUTTON));
	}

	public static void clickMyAccButton(WebDriver driver) {
		getMyAccButton(driver).click();
	}
	public static WebElement getCartButton(WebDriver driver) {
		return driver.findElement(By.xpath(CART_BUTTON));
	}

	public static void clickCartButton(WebDriver driver) {
		getCartButton(driver).click();
	}
	


	// Checking if menu on the left side works correctly
	public static void ClickLeftFish(WebDriver driver) {
		WebElement lfish = driver.findElement(By.xpath("//div[@id='Content']//a[1]//img[1]"));
		lfish.click();
	}

	public static void ClickLeftDogs(WebDriver driver) {
		WebElement ldogs = driver.findElement(By.xpath("//div[@id='Content']//a[2]//img[1]"));
		ldogs.click();

	}

	public static void ClickLeftCats(WebDriver driver) {
		WebElement lcats = driver.findElement(By.xpath("//div[@id='Content']//a[3]//img[1]"));
		lcats.click();
	}

	public static void ClickLeftReptiles(WebDriver driver) {
		WebElement lreptiles = driver.findElement(By.xpath("//div[@id='Content']//a[4]//img[1]"));
		lreptiles.click();
	}

	public static void ClickLeftBirds(WebDriver driver) {
		WebElement lbirds = driver.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]"));
		lbirds.click();
	}

	// Checking if menu on the top works correctly
	public static void ClickTopFish(WebDriver driver) {
		WebElement tfish = driver.findElement(By.xpath("//div[@id='QuickLinks']//a[1]//img[1]"));
		tfish.click();
	}

	public static void ClickTopDogs(WebDriver driver) {
		WebElement tdogs = driver.findElement(By.xpath("//div[@id='Header']//a[2]//img[1]"));
		tdogs.click();

	}

	public static void ClickTopCats(WebDriver driver) {
		WebElement tcats = driver.findElement(By.xpath("//div[@id='Header']//a[4]//img[1]"));
		tcats.click();
	}

	public static void ClickTopReptiles(WebDriver driver) {
		WebElement treptiles = driver.findElement(By.xpath("//div[@id='Header']//a[3]//img[1]"));
		treptiles.click();
	}

	public static void ClickTopBirds(WebDriver driver) {
		WebElement tbirds = driver.findElement(By.xpath("//div[@id='Header']//a[5]//img[1]"));
		tbirds.click();
	}

	// Checking if menu whith pictures works correctly
	public static void ClickPicFish(WebDriver driver) {
		WebElement pfish = driver.findElement(By.xpath("//body//area[2]"));
		pfish.click();
	}

	public static void ClickPicDogs(WebDriver driver) {
		WebElement pdogs = driver.findElement(By.xpath("//body//area[3]"));
		pdogs.click();

	}

	public static void ClickPicCats(WebDriver driver) {
		WebElement pcats = driver.findElement(By.xpath("//body//area[5]"));
		pcats.click();
	}

	public static void ClickPicReptiles(WebDriver driver) {
		WebElement preptiles = driver.findElement(By.xpath("//body//area[4]"));
		preptiles.click();
	}

	public static void ClickPicBirds(WebDriver driver) {
		WebElement pbirds = driver.findElement(By.xpath("//body//area[6]"));
		pbirds.click();
	}

	public static void ClickPicBirds1(WebDriver driver) {
		WebElement p1birds = driver.findElement(By.xpath("//body//area[1]"));
		p1birds.click();
	}

	// Checking if button Sign in works correctly
	public static void ClickSignInButton(WebDriver driver) {
		WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		signIn.click();

	}
}