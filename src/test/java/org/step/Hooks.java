package org.step;

import java.io.IOException;

import org.base.BaseClass;

import org.junit.AfterClass;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void befScenario() {
	System.out.println("Execution starts >>>>>>>>");
	launchBrowser();
	maxiWindow();
	applyImplicitWait();
	deleteAllCookies();
		

	}
	
@After
	public void aftScenario(Scenario s) throws IOException {
		String sceName = s.getName();
		String picName = sceName.replace(" ", "_");
		takeSnap(picName);
		System.out.println("Execution ends >>>>>>>>");
		

	}

}
