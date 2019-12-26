package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	public static final String MY_ACCOUNT_LINK = "//a[contains(text(),'My Account')]";
	public static final String REGISTRATION_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	private static final String USER_ID = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NEW_PASSWORD = "//input[@name='password']";
	private static final String REPEAT_PASSWORD = "//input[@name='repeatedPassword']";
	private static final String FIRST_NAME = "//input[@name='account.firstName']";
	private static final String LAST_NAME = "//input[@name='account.lastName']";
	private static final String EMAIL = "//input[@name='account.email']";
	private static final String PHONE = "//input[@name='account.phone']";
	private static final String ADDRESS1 = "//input[@name='account.address1']";
	private static final String ADDRESS2 = "//input[@name='account.address2']";
	private static final String CITY = "//input[@name='account.city']";
	private static final String STATE = "//input[@name='account.state']";
	private static final String ZIP = "//input[@name='account.zip']";
	private static final String COUNTRY = "//input[@name='account.country']";
	private static final String SELECT_LANGUAGE = "//select[@name='account.languagePreference']";
	private static final String SELECT_CATEGORY = "//select[@name='account.favouriteCategoryId']";
	private static final String ENABLE_MYLIST = "//input[@name='account.listOption']";
	private static final String ENABLE_MYBANNER = "//input[@name='account.bannerOption']";
	private static final String SAVE_ACCOUNT_INFORMATION = "//input[@name='newAccount']";
	private static final String BTNCHANGE_XPATH = "//input[@name='editAccount']";
	
	private static final String PERSIAN_CAT_XPATH = "//a[contains(text(),'FL-DLH-02')]";
	private static final String PERSIAN_CAT_MALE_XPATH = "//a[contains(text(),'EST-17')]";
	private static final String ADD_PERSIAN_CAT_MALE_XPATH = "//a[@class='Button']";
	public static final String EST_17_PERSIAN_CAT_XPATH = "//a[contains(text(),'EST-17')]";
	
	// Method to find User ID field
	public static WebElement getUserId(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(USER_ID));
		return element;
	}

	// Method to click on User ID field
	public static void clickUserId(WebDriver driver) {
		getUserId(driver).click();
	}

	// Method to set User ID
	public static void sendKeysUserId(WebDriver driver, String str) {
		getUserId(driver).sendKeys(str);
	}
	// Method to find New Password field
	public static WebElement getNewPassword(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(NEW_PASSWORD));
		return element;
	}

	// Method to click on New Password field
	public static void clickNewPassword(WebDriver driver) {
		getNewPassword(driver).click();
	}

	// Method to set New Password
	public static void sendKeysNewPassword(WebDriver driver, String str) {
		getNewPassword(driver).sendKeys(str);
	}
	// Method to find Repeat password field
	public static WebElement getRepeatPassword(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(REPEAT_PASSWORD));
		return element;
	}

	// Method to click on Repeat password field
	public static void clickRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).click();
	}

	// Method to set Repeat password
	public static void sendKeysRepeatpassword(WebDriver driver, String str) {
		getRepeatPassword(driver).sendKeys(str);
	}
	
	// Method to find First name field
	public static WebElement getFirstName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(FIRST_NAME));
		return element;
	}

	// Method to click on First name field
	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	// Method to set First name
	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	// Method to find Last name field
	public static WebElement getLastName(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(LAST_NAME));
		return element;
	}

	// Method to click on Last name field
	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	// Method to set Last name
	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	
    // Method to find Email field
	public static WebElement getEmail(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(EMAIL));
		return element;
	}

	// Method to click on Email field
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	// Method to set Email
	public static void sendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}
	
	// Method to find Phone field
	public static WebElement getPhone(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(PHONE));
		return element;
	}

	// Method to click on Phone field
	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	// Method to set Phone
	public static void sendKeysPhone(WebDriver driver, String str) {
		getPhone(driver).sendKeys(str);
	}

	// Method to find Address 1 field
	public static WebElement getAddress1(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(ADDRESS1));
		return element;
	}

	// Method to click on Address 1 field
	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	// Method to set Address 1
	public static void sendKeysAddress1(WebDriver driver, String str) {
		getAddress1(driver).sendKeys(str);
	}
	// Method to find Address 2 field
	public static WebElement getAddress2(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(ADDRESS2));
		return element;
	}

	// Method to click on Address 2 field
	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	// Method to set Address 2
	public static void sendKeysAddress2(WebDriver driver, String str) {
		getAddress2(driver).sendKeys(str);
	}
	// Method to find City field
	public static WebElement getCity(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(CITY));
		return element;
	}

	// Method to click on City field
	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	// Method to set City
	public static void sendKeysCity(WebDriver driver, String str) {
		getCity(driver).sendKeys(str);
	}

	
	// Method to find State field
	public static WebElement getState(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(STATE));
		return element;
	}

	// Method to click on State field
	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	// Method to set State
	public static void sendKeysState(WebDriver driver, String str) {
		getState(driver).sendKeys(str);
	}
	// Method to find Zip field
	public static WebElement getZip(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(ZIP));
		return element;
	}

	// Method to click on Zip field
	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	// Method to set Zip
	public static void sendKeysZip(WebDriver driver, String str) {
		getZip(driver).sendKeys(str);
	}
	// Method to find Country field
	public static WebElement getCountry(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(COUNTRY));
		return element;
	}

	// Method to click on Country field
	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	// Method to set Country
	public static void sendKeysCountry(WebDriver driver, String str) {
		getCountry(driver).sendKeys(str);
	}
	// Mathod to  find language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_LANGUAGE)));
		}
	// Mathod to  select language
	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}
		
	// Mathod to  find category
	public static Select getCategory(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_CATEGORY)));
			}

	public static void inputCategory(WebDriver driver, String data) {
			getCategory(driver).selectByVisibleText(data);
	}
	
	// Method to find Enable MyList
	public static WebElement getEnableMyList(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath(ENABLE_MYLIST));
		return element;
		}

	// Method to click on Enable MyList
	public static void clickEnableMyList(WebDriver driver) {
		getEnableMyList(driver).click();
	}
	
	// Method to find Enable MyBanner
	public static WebElement getEnableMyBanner(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(ENABLE_MYBANNER));
		return element;
		}

	// Method to click on Enable MyBanner
	public static void clickEnableMyBanner(WebDriver driver) {
		getEnableMyBanner(driver).click();
		}
	
	// Method to find Save Account 
	public static WebElement getSaveAccount(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(SAVE_ACCOUNT_INFORMATION));
		return element;
			}

	// Method to click on Save Account
	public static void clickSaveAccount(WebDriver driver) {
		getSaveAccount(driver).click();
		}
	//Save Change Account Information
		public static WebElement getChangeAccountInfo(WebDriver driver) {
			return driver.findElement(By.xpath(BTNCHANGE_XPATH));
		}

		public static void clickChangeAccountInfo(WebDriver driver) {
			getChangeAccountInfo(driver).click();
		}
		// Persian Cat
		public static WebElement getPersianCat(WebDriver driver) {
			return driver.findElement(By.xpath(PERSIAN_CAT_XPATH));
		}

		public static void clickPersianCat(WebDriver driver) {
			getPersianCat(driver).click();
		}

		// Persian Cat Male
		public static WebElement getPersianCatMale(WebDriver driver) {
			return driver.findElement(By.xpath(PERSIAN_CAT_MALE_XPATH));
		}

		public static void clickPersianCatMale(WebDriver driver) {
			getPersianCatMale(driver).click();
		}

		// Add Persian Cat Male
		public static WebElement getAddPersianCatMale(WebDriver driver) {
			return driver.findElement(By.xpath(ADD_PERSIAN_CAT_MALE_XPATH));
		}

		public static void clickAddPersianCatMale(WebDriver driver) {
			getAddPersianCatMale(driver).click();
		}


	
	
	

	
}



