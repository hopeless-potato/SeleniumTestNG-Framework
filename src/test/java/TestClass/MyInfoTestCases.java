package TestClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;
import page.object.models.LoginPageObjects;
import page.object.models.MyInfoObjects;

public class MyInfoTestCases extends BaseClass {

	@Test
	public void fillPersonalDetails() throws IOException, InterruptedException, AWTException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys(Constants.username);
		lpo.enterPassword().sendKeys(Constants.validPassowrd);
		lpo.clickLogin().click();

		MyInfoObjects mpo = new MyInfoObjects(driver);
		Thread.sleep(2000);

		mpo.clickonmyinfo().click();
		Thread.sleep(2000);

		mpo.typefirstName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typefirstName().sendKeys(Constants.firstName);
		Thread.sleep(1000);

		mpo.typemiddleName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typemiddleName().sendKeys(Constants.middleName);

		mpo.typelastName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typelastName().sendKeys(Constants.lastName);
		Thread.sleep(2000);

		mpo.typenickName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typenickName().sendKeys(Constants.nickName);
		Thread.sleep(2000);

		mpo.typeemployeeID().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typeemployeeID().sendKeys(Constants.employeeID);
		Thread.sleep(2000);

		mpo.typeotherID().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.typeotherID().sendKeys(Constants.otherID);
		Thread.sleep(2000);

		mpo.enterLicense().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.enterLicense().sendKeys(Constants.License);
		Thread.sleep(2000);

		mpo.selectExpiry().click();
		mpo.selectExpiryMonth().click();
		Thread.sleep(2000);

		CommonMethods.handleDropDown(mpo.selectMonth(), Constants.expiryMonth);

		mpo.selectExpiryYear().click();
		Thread.sleep(2000);

		CommonMethods.handleDropDown(mpo.selectYear(), Constants.expiryYear);

		Thread.sleep(2000);
		CommonMethods.handleDropDown(mpo.selectExpiryDate(), Constants.expiryDate);

		mpo.enterSSN().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.enterSSN().sendKeys("SSN123");

		mpo.enterSIN().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.enterSIN().sendKeys("SIN123");

		mpo.clickOnArrow().click();
		Thread.sleep(2000);

		CommonMethods.handleDropDown(mpo.selectIndian(), Constants.Nationality);

		mpo.selectStatus().click();
		Thread.sleep(2000);
		mpo.selectSingle().click();

		Thread.sleep(2000);
		mpo.selectMale().click();

		Thread.sleep(2000);
		mpo.selectPosition().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mpo.selectPosition().sendKeys(Constants.militaryService);

		mpo.selectBloodtype().click();
		Thread.sleep(2000);

		CommonMethods.handleDropDown(mpo.selectOpositive(), Constants.bloodGroup);

		mpo.clickOnadd().click();
		mpo.clickOnbrowse().click();
		Thread.sleep(2000);
		setClipboardData(Constants.attachment);
		// native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
}
