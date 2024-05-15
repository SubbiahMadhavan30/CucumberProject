package org.listmapstepsdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepsdef.Adactinpom;
import org.stepsdef.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearchHotel extends BaseClass {
    Adactinpom p;
	
	@When("user select the location ,hotel,roomtype,noofrooms")
	public void user_select_the_location_hotel_roomtype_noofrooms(DataTable d) {
	   p = new Adactinpom();
	   List<Map<String, String>> mps = d.asMaps();
	   WebElement alloptions = driver.findElement(By.xpath("//select[@id='location']"));
	   Select s =new Select(alloptions);
	   List<WebElement> options = s.getOptions();
	   for (int i = 0; i < options.size(); i++) {
		   Assert.assertTrue("options not displayed" ,options.get(i).isDisplayed());
		
	}
	   System.out.println(options.size());
	   System.out.println(options);
	   selectByVisibleTextt(p.getLocation(), mps.get(0).get("Location"));
		selectByVisibleTextt(p.getHotels(), mps.get(0).get("Hotels"));
		selectByVisibleTextt(p.getRoomType(),mps.get(0).get("Room Type"));
		selectByVisibleTextt(p.getNoOfRooms(),mps.get(0).get("Numbers of Rooms"));
	}
	@When("user select the checkindate and checkoutdate")
	public void user_select_the_checkindate_and_checkoutdate(DataTable d) {
         p= new Adactinpom();
         Map<String, String> mp = d.asMap(String.class, String.class);
         clear(p.getCheckIn());
         entertext(p.getCheckIn(),mp.get("Check In Date"));
         clear(p.getCheckOut());
         entertext(p.getCheckOut(),mp.get("Check Out Date"));
         
        		 

	}
	@When("user select the adultperroom and childrenperroom")
	public void user_select_the_adultperroom_and_childrenperroom(DataTable d) {
		p=new Adactinpom();
		Map<String, String> mp = d.asMap(String.class, String.class);
		entertext(p.getAdultPerRoom(), mp.get("Adults per Room"));
		entertext(p.getChildPerRoom(), mp.get("Children per Room"));
		
	  
	}
	@Then("click the search button")
	public void click_the_search_button() {
	  p=new Adactinpom();
	  clickElement(p.getSearch());
	  
	}



}
