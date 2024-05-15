package org.screenshotstepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.stepsdef.Adactinpom;
import org.stepsdef.BaseClass;
public class LoginPage extends BaseClass{	
           Adactinpom p;
           @Given("user launch the Adactin application")
           public void user_launch_the_Adactin_application() {
        	   launchurl("http://adactinhotelapp.com/");
           }

@When("user enter the valid username and valid password")
public void user_enter_the_valid_username_and_valid_password(DataTable d) {
   p= new Adactinpom();
   Map<String, String> m = d.asMap(String.class, String.class);
   entertext(p.getUsername(), m.get("username"));
   entertext(p.getPassword(),m.get("password"));
}

@Then("user click login button")
public void user_click_login_button() {
	//p = new Adactinpom();
   clickElement(p.getLogin());
}

@Then("user see the next page")
public void user_see_the_next_page() {
    
   
}

@When("user enter the valid username and invalid password")
public void user_enter_the_valid_username_and_invalid_password(DataTable d) {
	   p= new Adactinpom();
	
   List<String> l = d.asList();
   
  entertext(p.getUsername(),l.get(0));
  entertext(p.getPassword(),l.get(1));
   
}

@Then("user see the error message")
public void user_see_the_error_message() {
   
}

@When("user enter the invalid username and valid password")
public void user_enter_the_invalid_username_and_valid_password(DataTable d) {
	  
	  
   p=new Adactinpom();
   List<List<String>> li = d.asLists();
   entertext(p.getUsername(), li.get(0).get(0));
   entertext(p.getPassword(), li.get(0).get(1));
}

@When("user enter the invalid username and invalid password")
public void user_enter_the_invalid_username_and_invalid_password(DataTable d) {
	   p= new Adactinpom();

  List<Map<String, String>> mp = d.asMaps(String.class, String.class);
  entertext(p.getUsername(), mp.get(0).get("username"));
  entertext(p.getPassword(), mp.get(1).get("password"));
}






}
