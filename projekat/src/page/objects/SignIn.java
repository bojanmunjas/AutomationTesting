package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static final String LOG_IN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";

	private static final String USER = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String PASS = "//input[@name='password']";
	private static final String LOG_IN = "//input[@name='signon']";
	private static final String SIGN_IN = "//a[contains(text(),'Sign In')]";
	private static final String LOG_OUT = "//a[contains(text(),'Sign Out')]";
	private static final String REGISTRATION = "//a[contains(text(),'Register Now!')]";

	// Method to open LogIn page
	public static void openLogInPage(WebDriver driver) {
		driver.get(LOG_IN_URL);
	}

	// Method to navigate to LogIn page
	// if other page is opened
	public static void navigateToLogInPage(WebDriver driver) {
		driver.navigate().to(LOG_IN_URL);
	}

	// Method to find LogIn Username field
	public static WebElement getUser(WebDriver driver) {
		WebElement user = driver.findElement(By.xpath(USER));
		return user;
	}

	// Method to click on LogIn Username field
	public static void clickUser(WebDriver driver) {
		getUser(driver).click();
	}

	// Method to set LogIn Username
	public static void sendKeysUser(WebDriver driver, String str) {
		getUser(driver).sendKeys(str);
	}

	// Method to find LogIn Password field
	public static WebElement getPass(WebDriver driver) {
		WebElement pass = driver.findElement(By.xpath(PASS));
		return pass;
	}

	// Method to click on LogIn Password field
	public static void clickPass(WebDriver driver) {
		getPass(driver).click();
	}

	// Method to clear LogIn Password field
	public static void clearPass(WebDriver driver) {
		getPass(driver).clear();
	}

	// Method to set LogIn Password
	public static void sendKeysPass(WebDriver driver, String str) {
		getPass(driver).sendKeys(str);
	}

	// Method to find LogIn Button
	public static WebElement getLogInButton(WebDriver driver) {
		WebElement logIn = driver.findElement(By.xpath(LOG_IN));
		return logIn;
	}

	// Method to click on LogIn Button
	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	// Method to find LogOut Button
	public static WebElement getLogOutButton(WebDriver driver) {
		WebElement logOut = driver.findElement(By.xpath(LOG_OUT));
		return logOut;
	}

	// Method to click on LogOut Button
	public static void clickLogOutButton(WebDriver driver) {
		getLogOutButton(driver).click();
	}

	// Method to find Registration Button
	public static WebElement getRegistrationButton(WebDriver driver) {
		WebElement registration = driver.findElement(By.xpath(REGISTRATION));
		return registration;
	}

	// Method to click on Registration Button
	public static void clickRegistrationButton(WebDriver driver) {
		getRegistrationButton(driver).click();
	}

	// Method to find Sign In Button
	public static WebElement getSignInButton(WebDriver driver) {
		WebElement logIn = driver.findElement(By.xpath(SIGN_IN));
		return logIn;
	}

	// Method to click on Sign In Button
	public static void clickSignInButton(WebDriver driver) {
		getSignInButton(driver).click();

	}
}
