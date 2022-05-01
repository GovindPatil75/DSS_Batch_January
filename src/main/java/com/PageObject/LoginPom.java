package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement LoginBtn;

	public WebElement getEmailid() {
		return Emailid;
	}

	public void setEmailid(WebElement emailid) {
		Emailid = emailid;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		LoginBtn = loginBtn;
	}
}
