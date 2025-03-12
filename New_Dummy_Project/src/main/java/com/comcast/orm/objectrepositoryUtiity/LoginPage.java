package com.comcast.orm.objectrepositoryUtiity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{   //Rule-1 create a separate java class
	                       //Rule-2 object Creation
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;

	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	

	
		                                     //Rule 3: Object Initialization(we are doing it in the createOrganization class)
		
		//Rule 4: Object Encapsulation
		
		public WebElement getUsernameEdt() {
			return usernameEdt;
		}

		public WebElement getPasswordEdt() {
			return passwordEdt;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
			
			//Rule 5: provide Action
			public void loginToapp(String url , String username , String password) {
				waitForPageToLoad(driver);
				driver.get(url);
				driver.manage().window().maximize();
				usernameEdt.sendKeys(username);
				passwordEdt.sendKeys(password);
				loginBtn.click();
			}
		      
}
