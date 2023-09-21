package TestClass;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;
import page.object.models.LoginPageObjects;

public class LoginTestCases extends BaseClass {
	public SoftAssert sa;
    //for demo purpose
	//adding this comment to commit it to the new branch
	
	@Test
	public void verifyValidLogin() throws IOException, InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        Thread.sleep(1000);
		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys(Constants.username);
		lpo.enterPassword().sendKeys(Constants.validPassowrd);
		lpo.clickLogin().click();
		
		Thread.sleep(2000);
		
		CommonMethods.handleAssertion(Constants.validLoginURL, driver.getCurrentUrl());
	}
	
	@Test(priority=1)
	public void verifyInvalidLogin() throws IOException, InterruptedException {
		
        Thread.sleep(2000);  
		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys(Constants.username);
		lpo.enterPassword().sendKeys(Constants.invalidPassword);
		lpo.clickLogin().click();
		
		Thread.sleep(2000);
		
		CommonMethods.handleAssertion(lpo.getInvalidLoginText().getText(), Constants.InvalidErrorText);
	}
}
