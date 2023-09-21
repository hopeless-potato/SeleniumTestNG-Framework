package page.object.models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoObjects {
	
	public WebDriver driver;
	
		private By myinfo=By.xpath("//span[normalize-space()='My Info']");
	    private By firstName=By.xpath("//input[@name='firstName']");
	    private By middleName=By.xpath("//input[@name='middleName']");
	    private By lastName=By.xpath("//input[@name='lastName']");
	    private By nickName=By.xpath("(//div[@data-v-957b4417='']/input)[4]");
	    private By employeeID=By.xpath("(//div[@data-v-957b4417='']/input)[5]");
	    private By otherID=By.xpath("(//div[@data-v-957b4417='']/input)[6]");
	    private By drivingLicense=By.xpath("(//div[@data-v-957b4417='']/input)[7]");
	    
	    private By LicenseExpiry=By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");
	    private By expiryMonth=By.xpath("//li[@class='oxd-calendar-selector-month']");
	    private By monthDropdown=By.xpath("//ul[@class='oxd-calendar-dropdown']/li");
	    private By expiryYear=By.xpath("//li[@class='oxd-calendar-selector-year']");
	    private By yearDropdown=By.xpath("//ul[@class='oxd-calendar-dropdown']/li");
	    private By selectDate=By.xpath("//div[@class='oxd-calendar-dates-grid']/div");
	    
	    private By ssnNumber=By.xpath("(//div[@data-v-957b4417='']/input)[8]");
	    private By sinNumber=By.xpath("(//div[@data-v-957b4417='']/input)[9]");
	    private By nationalityDropDown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	    private By selectNationality=By.xpath("//div[@class='oxd-select-option']");
	    private By maritalStatusDropDown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	    private By selectyourStatus=By.xpath("(//div[@class='oxd-select-option'])[3]");
	    private By selectGender=By.xpath("//label[normalize-space()='Male']");
	    private By militaryService=By.xpath("(//div[@data-v-957b4417='']/input)[10]");
	    private By bloodGroupDropDown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	    private By selectBloodgroup=By.xpath("//div[@role='option']");
	    private By clickOnPlusicon =By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	    private By clicktoBrowsefile=By.xpath("//div[@class='oxd-file-div oxd-file-div--active']");
	    
		public MyInfoObjects(WebDriver driver2) {
			this.driver=driver2;	
		}

		public WebElement clickonmyinfo() {
			return driver.findElement(myinfo);
		}
		
		public WebElement typefirstName() {
			return driver.findElement(firstName);
		}
		
		public WebElement typemiddleName() {
			return driver.findElement(middleName);
		}
		
		public WebElement typelastName() {
			return driver.findElement(lastName);
		}
		
		public WebElement typenickName() {
			return driver.findElement(nickName);
		}
		
		public WebElement typeemployeeID() {
			return driver.findElement(employeeID);
		}
		
		public WebElement typeotherID() {
			return driver.findElement(otherID);
		}
		
		public WebElement enterLicense() {
			return driver.findElement(drivingLicense);
		}
		
		public WebElement selectExpiry() {
			return driver.findElement(LicenseExpiry);
		}
		
		public WebElement selectExpiryMonth() {
			return driver.findElement(expiryMonth);
		}
		
		public List<WebElement> selectMonth() {
			return driver.findElements(monthDropdown);
		}
		
		public WebElement selectExpiryYear() {
			return driver.findElement(expiryYear);
		}
		
		public List<WebElement> selectYear() {
			return driver.findElements(yearDropdown);
		}
		
		public List<WebElement> selectExpiryDate() {
			return driver.findElements(selectDate);
		}
		
		public WebElement enterSSN() {
			return driver.findElement(ssnNumber);
		}
		
		public WebElement enterSIN() {
			return driver.findElement(sinNumber);
		}
		
		public WebElement clickOnArrow() {
			return driver.findElement(nationalityDropDown);
		}
		
		public List<WebElement> selectIndian() {
			return driver.findElements(selectNationality);
		}
		
		public WebElement selectStatus() {
			return driver.findElement(maritalStatusDropDown);
		}
		
		public WebElement selectSingle() {
			return driver.findElement(selectyourStatus);
		}
		
		public WebElement selectMale() {
			return driver.findElement(selectGender);
		}
		public WebElement selectPosition() {
			return driver.findElement(militaryService);
		}
		
		public WebElement selectBloodtype() {
			return driver.findElement(bloodGroupDropDown);
		}
		
		public List<WebElement> selectOpositive() {
			return driver.findElements(selectBloodgroup);
		}
		
		public WebElement clickOnadd() {
			return driver.findElement(clickOnPlusicon);
		}
		
		public WebElement clickOnbrowse() {
			return driver.findElement(clicktoBrowsefile);
		}
	}


