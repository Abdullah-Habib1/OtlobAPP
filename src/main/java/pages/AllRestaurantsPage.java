package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllRestaurantsPage extends PageBase {
	
	public AllRestaurantsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="search-rest")
	public WebElement SearchTxtBox;
	
	@FindBy(css = ".p-y-md > .bold.h3")
	public WebElement SearchResultMsg;
	
	@FindBy(css = "[class='h5 m-a-0 truncate linespace']")
	public WebElement ResturantFound;
	
	public void SearchResturants(String KeywordSearch )

	{
		setTextElementText(SearchTxtBox, KeywordSearch);
		
	}

}
