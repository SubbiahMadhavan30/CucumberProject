package org.hastag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Hashtagpom extends BaseClass {
public Hashtagpom() {
	PageFactory.initElements(driver, this);
}
@FindBy (xpath="//input[@placeholder='Enter your name']")
private WebElement EnterName;


@FindBy (xpath="(//input[@placeholder='Enter your email'])[1]")
private WebElement EnterEmail;

@FindBy(xpath="//input [@name='phone']")
private WebElement PhoneNumber;

@FindBy(xpath="//input [@id='inputFile']")
private WebElement Resume;

@FindBy(xpath="//textarea [@ name='description']")
private WebElement Description;


}
