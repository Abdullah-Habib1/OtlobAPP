package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void StartDriver() {
		//To overcome failed to load extension pop up dialogue
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().to("https://www.otlob.com/egypt?gclid=EAIaIQobChMI49nyueiD6gIViLUYCh2xRwJEEAAYASAAEgIOx_D_BwE");

	}
	@AfterSuite
	public void StopDriver() {

		driver.quit();
	}
}