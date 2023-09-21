package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleAssertion(String actual, String expected) {
		
		SoftAssert sa=new SoftAssert();
		String expectedText=expected;
		String actualText=actual;
		
		sa.assertEquals(actualText, expectedText);
		sa.assertAll();
	}
	
	public static void handleDropDown(List<WebElement> xpath, String text) {
		
		List<WebElement> ref = xpath;

		for (WebElement x : ref) {
			if (x.getText().equalsIgnoreCase(text)) {
				x.click();
				break;
			}
		}
	}
}
