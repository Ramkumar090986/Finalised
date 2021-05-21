package org.step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		loadUrl("https://www.facebook.com/");
	}

	@When("user enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
		WebElement txtUsername = driver.findElement(By.id("email"));
		fill(txtUsername, "Java");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		fill(txtPassword, "Java@123");
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
	}

	@Then("user clicks on the forgotten password link")
	public void user_clicks_on_the_forgotten_password_link() {
		WebElement lnkForg = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		click(lnkForg);
	}

	@Then("user enters the mobile number or email address")
	public void user_enters_the_mobile_number_or_email_address() {
		WebElement txtRecover = driver.findElement(By.name("email"));
		fill(txtRecover, "8754544243");
	}

	@Then("user validates the forgotten password link")
	public void user_validates_the_forgotten_password_link() {
		System.out.println("User is on forgotten page");
	}
	@When("user clicks on the Create New Account")
	public void user_clicks_on_the_Create_New_Account() {
	    WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    click(btnCreate);
	}

	@Then("user should enter all the valid credentials")
	public void user_should_enter_all_the_valid_credentials() {
		WebElement txtfName = driver.findElement(By.name("firstname"));
	    fill(txtfName, "Ramkumar");
	    WebElement txtlName = driver.findElement(By.name("lastname"));
	    fill(txtlName, "Venkataraman");
	    WebElement txtEmail = driver.findElement(By.name("reg_email__"));
	    fill(txtEmail, "ramkumar8687@gmail.com");
	    WebElement txNewPass = driver.findElement(By.name("reg_passwd__"));
	    fill(txNewPass, "Devika@64");
	    WebElement drpDay = driver.findElement(By.id("day"));
	    Select s=new Select(drpDay);
	    s.selectByVisibleText("9");
	    WebElement drpMonth = driver.findElement(By.id("month"));
	    Select s1=new Select(drpMonth);
	    s1.selectByVisibleText("Sep");
	    WebElement drpYear = driver.findElement(By.id("year"));
	    Select s2=new Select(drpYear);
	    s2.selectByVisibleText("1986");
	    WebElement radMale = driver.findElement(By.xpath("//input[@value='2']"));
	    click(radMale);
	}

	
	@Then("user clicks on the Signup button")
	public void user_clicks_on_the_Signup_button() {
		WebElement btnSignup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		click(btnSignup);
	}

}
