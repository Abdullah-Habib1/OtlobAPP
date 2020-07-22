package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AllRestaurantsPage;
import pages.LandingPage;


public class MainTestClass extends TestBase{

	LandingPage LandingPageObject;
	AllRestaurantsPage AllRestaurantsPageObject;


	//Testing changing the page language into Arabic
	@Test(priority = 1)
	public void ChangeLanguageIntoArabic() {

		LandingPageObject = new LandingPage(driver);
		LandingPageObject.ChangeLanguageIntoArabic();
		Assert.assertTrue(LandingPageObject.BannerMessage.getText().contains("اطلب الطعام"));
	}

	//Testing reverting the page language back into English
	@Test(priority = 2)
	public void ChangeLanguagebackIntoEnglish() {

		LandingPageObject = new LandingPage(driver);
		LandingPageObject.ChangeLanguageIntoEnglish();
		Assert.assertTrue(LandingPageObject.BannerMessage.getText().contains("Order food online in Egypt"));
	}
	//Testing Searching for a not valid resturant
	@Test(priority = 3)
	public void SearchForAnotValidResturant() {
		
		String	KeywordSearch = "456789";
		LandingPageObject = new LandingPage(driver);
		LandingPageObject.AllRestaurantsList.click();
		AllRestaurantsPageObject = new AllRestaurantsPage(driver);
		AllRestaurantsPageObject.SearchResturants(KeywordSearch);
		Assert.assertTrue(AllRestaurantsPageObject.SearchResultMsg.getText().contains("No restaurants found"));
	}
	
	//Testing Searching for a valid restaurant
		@Test(priority = 4)
		public void SearchForAValidRestaurant() {
			
			String	KeywordSearch = "Fakhamto";
			LandingPageObject = new LandingPage(driver);
			AllRestaurantsPageObject.SearchTxtBox.clear();
			AllRestaurantsPageObject = new AllRestaurantsPage(driver);
			AllRestaurantsPageObject.SearchResturants(KeywordSearch);
			Assert.assertTrue(AllRestaurantsPageObject.ResturantFound.isDisplayed());
		}
		
		

}
