package org.listmapstepsdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.stepsdef.Adactinpom;
import org.stepsdef.BaseClass;

import io.cucumber.datatable.DataTable;
public class AdactinbookHotelpage extends BaseClass {
	
Adactinpom p;

	@When("user enter the firstname,lastname,billingaddress,creditcardnumber")
	public void user_enter_the_firstname_lastname_billingaddress_creditcardnumber(DataTable d) {
	   p = new Adactinpom();
	   List<List<String>> li = d.asLists();
	   entertext(p.getFirstName(),li.get(0).get(0));
	   entertext(p.getLastName(), li.get(0).get(1));
		entertext(p.getAddress(), li.get(0).get(2));
		entertext(p.getCardNumber(),li.get(0).get(3));
	}
	@When("user enter the creditcardtype and expirydate")
	public void user_enter_the_creditcardtype_and_expirydate(DataTable d) {
	  p=new Adactinpom();
	  List<List<String>> li = d.asLists();
	  selectByVisibleTextt(p.getCardType(),li.get(0).get(0));
	  selectByVisibleTextt(p.getMonth(), li.get(0).get(1));
	  selectByVisibleTextt(p.getYear(), li.get(0).get(2));
	}
	@When("user enter the cvv number")
	public void user_enter_the_cvv_number(DataTable d) {
	   p=new Adactinpom();
	  Map<String, String> m = d.asMap(String.class, String.class);
	   entertext(p.getCvv(),m.get("CVV"));
	}
	@Then("user click the booking button")
	public void user_click_the_booking_button() {
	  p=new Adactinpom();
	  clickElement(p.getBookNow());
	}



}
