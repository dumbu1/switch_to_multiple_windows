package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;

public class MultipleWindowsHandle_HomePage {
	
	private WebDriver driver;
	public MultipleWindowsHandle_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElement link_Click_Here;

	@FindBy(xpath = "//h3")
	private WebElement lable_text;
	
	public void navigateToMultiplePage() {
		HomePage obj_HomePage=new HomePage(SeleniumSpecificMethods.getDriver());
		obj_HomePage.click_MultipleWindows();
	}
	
	public void click_ClickHere() {
		SeleniumSpecificMethods.click(link_Click_Here);
	}
	
	public void verifyText(String expectedText) {
		
		Assert.assertEquals(expectedText, SeleniumSpecificMethods.getText_lable(lable_text));
	}
	
}
