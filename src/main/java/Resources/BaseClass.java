package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	public void Initializedriver() throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("Please choose valid browser");
		}
	}

	@BeforeMethod
	public void urlLaunch() throws IOException {
		Initializedriver();
		driver.get(prop.getProperty("url"));
	}
}
