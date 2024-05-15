package org.stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinBookHotelPage extends BaseClass {
	 Adactinpom p;

	@When("user enter the FirstName {string},LastName {string} ,BillingAddress {string} ,CreditCardNo {string}")
	public void user_enter_the_first_name_last_name_billing_address_credit_card_no(String fn, String ln, String address, String cardno) {
		p= new Adactinpom();

		entertext(p.getFirstName(), fn);
		entertext(p.getLastName(), ln);
		entertext(p.getAddress(), address);
		entertext(p.getCardNumber(), cardno);
	}
	

	@When("user select the CreditCardType {string},ExpiryDate {string} {string}")
	public void user_select_the_credit_card_type_expiry_date(String cardtype, String month, String year) {
		p= new Adactinpom();
		selectByVisibleTextt(p.getCardType(), cardtype);
		selectByVisibleTextt(p.getMonth(), month);
		selectByVisibleTextt(p.getYear(), year);
	}



	
	/*@When("user select the CreditCardType {string},ExpiryDate {string}")
	public void user_select_the_credit_card_type_expiry_date(String string, String string2) {
	
		
	}
	*/
	@When("user enter the cvv number {string}")
	public void user_enter_the_cvv_number(String cvv) {
		p= new Adactinpom();
		entertext(p.getCvv(), cvv);
		
	}
	@When("click booknow button")
	public void click_booknow_button() {
		p= new Adactinpom();
		clickElement(p.getBookNow());
		
	}
	@Then("order id is generate")
	public void order_id_is_generate() {
		p= new Adactinpom();
		System.out.println("order number is generated");
	}



    // 
	/*@Given("user on Book a hotel page")
	public void user_on_book_a_hotel_page() {
	   System.out.println(driver.getCurrentUrl());
	}
	@When("user have to book a hotel")
	public void user_have_to_book_a_hotel() {
		System.out.println("user can able to book the hotel ");
	}
	@When("user enter the FirstName,LastName,BillingAddress,CreditCardNo")
	public void user_enter_the_first_name_last_name_billing_address_credit_card_no() {
		
	}
	@When("user select the CreditCardType,ExpiryDate")
	public void user_select_the_credit_card_type_expiry_date() {
		
	}
	@When("user enter the cvv number")
	public void user_enter_the_cvv_number() {
		
	}
	@When("click booknow button")
	public void click_booknow_button() {
		
	}
	@Then("order id is generate")
	public void order_id_is_generate() {
		
	   
	}

}*/

}
