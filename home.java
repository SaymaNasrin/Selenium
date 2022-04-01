package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class home {
	
	public WebDriver driver;

	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='lithium-root']/main/div/div[2]/div/div/div/a") WebElement hotelbtn;
	public void hotel() {
		hotelbtn.click();
	}
	@FindBy(xpath = "(//input[@name='q'])[3]") WebElement inputfield ;
	public void input() {
		inputfield.clear();
		inputfield.sendKeys("Switzerland");
	}
	Select drpSwit = new Select (driver.findElement(By.xpath("//div[@id='typeahead_results']/a")));
	public void select() {
		drpSwit.selectByVisibleText("Switzerland");
	}
	
	/*@FindBy(xpath ="//div[@id='PERSISTENT_TRIP_SEARCH_BAR']/div/div/div/div/button/div") WebElement checkin_click;
	public void checkin() {
		checkin_click.click();
	}*/
	
	@FindBy(xpath="//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]") WebElement checkDate;
	public void checkInD() {
		checkDate.click();
	}
	@FindBy(xpath="//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[6]") WebElement checkoutDate;
	public void checkoutD() {
		checkoutDate.click();
	}
	@FindBy(xpath="//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]") WebElement roomAdd;
	public void addroom() {
		roomAdd.click();
	}
	@FindBy(xpath = "//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]") WebElement adultAdd;
	public void addAdult() {
		adultAdd.click();
	}
	@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3)") WebElement childAdd;
	public void addChild() {
		childAdd.click();
	}
	@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div.fFUeN._R.Wc.Wh._m._S.Z.R2.Nc") WebElement age;
	public void ageClick() {
		age.click();
	}
	/*Select dropAge = new Select (driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/div[2]/button[4]")));
	public void ageC() {
		dropAge.selectByIndex(4);
	}*/
	@FindBy(css = "body#BODY_BLOCK_JQUERY_REFLOW button:nth-child(4)") WebElement Childage;
	public void ageC() {
		Childage.click();
	}
	
	@FindBy(xpath = "//button[contains(text(),'Update')]") WebElement UpdateBtn;
	public void btnUpdate() {
		UpdateBtn.click();
	}
//	@FindBy(xpath= "//span[contains(text(),'Hotel class')]") WebElement hotelclass;
	//public void hotelC() {
		
	//}
	
}
