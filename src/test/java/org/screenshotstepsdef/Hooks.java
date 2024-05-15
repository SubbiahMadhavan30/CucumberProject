package org.screenshotstepsdef;


import org.stepsdef.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
@Before
public void before() {
	launchBrowser("edge");
	
//	loadBrowser();
	maximizeBrowser();
	applywaitsToAllElements();
	

}
@After
public void after(Scenario s) {
takesnap(s.getName());
closeBrowser();


}

}
