package page.object.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;

	private By username=By.xpath("//input[@name='username']");
	
	private By password=By.xpath("//input[@name='password']");
	
	private By login=By.xpath("//button[@type='submit']");
	
	private By InvalidLoginText=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement enterUsername()  {
		
		return driver.findElement(username);	
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getInvalidLoginText() {
		return driver.findElement(InvalidLoginText);
	}
	
}
