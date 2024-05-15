package org.stepsdef;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearchHotelPage extends BaseClass{
	Adactinpom p;
	
	

	@When("user select the location {string}, Hotels {string} , RoomType {string}, NoofRooms {string}")
	public void user_select_the_location_hotels_room_type_noof_rooms(String loc, String hotel, String roomtype, String noofrooms) {
		p=new Adactinpom();
		selectByVisibleTextt(p.getLocation(), loc);
		selectByVisibleTextt(p.getHotels(), hotel);
		selectByVisibleTextt(p.getRoomType(), roomtype);
		selectByVisibleTextt(p.getNoOfRooms(), noofrooms);
	}
	
	@When("user enter checkindate {string} and checkoutdate {string}")
	public void user_enter_checkindate_and_checkoutdate(String checkin, String checkout) {
		p=new Adactinpom();
		clear(p.getCheckIn());
		entertext(p.getCheckIn(), checkin);
		clear(p.getCheckOut());
		entertext(p.getCheckOut(), checkout);
	   	}
	
	@When("user select AdultsPerRoom {string} and ChildrenPerRoom {string}")
	public void user_select_adults_per_room_and_children_per_room(String adultroom, String childrenroom) {
		p=new Adactinpom();
		selectByVisibleTextt(p.getAdultPerRoom(), adultroom);
		selectByVisibleTextt(p.getChildPerRoom(), childrenroom);
	}

	
	@Then("user click search button")
	public void user_click_search_button() {
		p=new Adactinpom();
		clickElement(p.getSearch());
	}





	  

}


	/*@Given("user can visible the Welcome to adactin group of Hotels")
	public void user_on_the_welcome_to_adactin_group_of_hotels() {
		
		System.out.println("user on the Search Hotel Page");  
	}
	
	@When("user select the location,Hotels,RoomType,NoofRooms")
	public void user_select_the_location_hotels_room_type_noof_rooms() {
		p=new Adactinpom();
		selectByVisibleTextt(p.getLocation(), "Brisbane");
		selectByVisibleTextt(p.getHotels(), "Hotel Creek");
		selectByVisibleTextt(p.getRoomType(), "Double");
		selectByVisibleTextt(p.getNoOfRooms(), "3 - Three");

	   
	}
	@When("user enter checkindate and checkoutdate")
	public void user_enter_checkindate_and_checkoutdate() {
		p=new Adactinpom();
		clear(p.getCheckIn());
		entertext(p.getCheckIn(), "14/09/2023");
		clear(p.getCheckOut());
		entertext(p.getCheckOut(), "15/09/2023");
	}
	@When("user select AdultsPerRoom,ChildrenPerRoom")
	public void user_select_adults_per_room_children_per_room() {
		p=new Adactinpom();
		selectByVisibleTextt(p.getAdultPerRoom(), "2 - Two");
		selectByVisibleTextt(p.getChildPerRoom(), "0 - None");
	}
	@When("user click search button")
	public void user_click_search_button() {
		p=new Adactinpom();
		clickElement(p.getSearch());
	}
	@Then(" user visible the search hotel u on the select hotel page")
	public void user_see_the_search_hotel() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
		System.out.println("user searched the hotel");
	}



}*/
