package org.stepsdef;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLoginPage extends BaseClass {

    Adactinpom p;
   

    @Given("user launch Adactin application")
    public void user_launch_adactin_application() throws Throwable {
    	launchBrowser("edge");
    	launchurl("http://adactinhotelapp.com/");
		maximizeBrowser(); 
		Thread.sleep(30000);
    	}
    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
    	p=new Adactinpom();
		entertext(p.getUsername(),username );
	   entertext(p.getPassword(), password);
    }
    @When("user click login button")
    public void user_click_login_button() {
    	p=new Adactinpom();
		clickElement(p.getLogin());
	   
    }
    @Then("user see the results based on credential type {string}")
    public void user_see_the_results_based_on_credential_type(String credentialtype) {
    	if(credentialtype.equals("positive")) {
    		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());
    	} else {
    		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Invalid Login details or Your Password might have expired. ']")).isDisplayed());
    	}
       
    }

   


   
    }



	/*@Given("user Launch the Browser")
	public void user_Launch_the_Browser() {
		
		}
	@When("user pass the valid url")
	public void user_pass_the_valid_url() {
		
	}
	@When("user Pass the valid username and Valid password")
	public void user_pass_the_valid_username_and_valid_password() {
		p=new Adactinpom();
		entertext(p.getUsername(), "vaithy2410");
	   entertext(p.getPassword(), "vaithy@2410");
	}
	@When("user Validate the login button")
	public void user_validate_the_login_button() {
		p=new Adactinpom();
		clickElement(p.getLogin());
	   
	}
	@Then("user check the username and password using Assertion ")
	public void user_check_the_username_and_password_using_assertion() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Search Hotel ']")).isDisplayed());
	    
	}



}*/
