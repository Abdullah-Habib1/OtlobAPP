package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageBase {
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "العربية")
	public WebElement ArabicLanguageSelector;
	
	@FindBy(linkText = "English")
	public WebElement EnglishLanguageSelector;

	@FindBy(linkText = "All Restaurants")
	public WebElement AllRestaurantsList;
	
	@FindBy(css = ".main-title.ng-binding.ng-scope.user-off")
	public WebElement BannerMessage;
	
	
	public void ChangeLanguageIntoArabic()

	{
		clickElement(ArabicLanguageSelector);
	}
	
	public void ChangeLanguageIntoEnglish()

	{
		clickElement(EnglishLanguageSelector);
	}

}

	

