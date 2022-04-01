package base;

import org.testng.annotations.Test;
import pages.home;
import base.base_class;

public class testcase extends base_class {
	@Test(priority = 1, enabled=true)
	public void clickNcheck() {
		home home_n = new home(driver);
		home_n.hotel(); 
		
	}
	@Test(priority = 2, enabled=true)
	public void inputCountry() {
		home home_n = new home(driver);
		home_n.input();
	}
	
	@Test(priority = 3, enabled=true)
	public void selectS() {
		home home_n = new home(driver);
		home_n.select();
	}
	@Test(priority = 4, enabled=true)
	public void inDate() {
		home home_n = new home(driver);
		home_n.checkInD();
	}
	@Test(priority = 5, enabled=true)
	public void outDate() {
		home home_n = new home(driver);
		home_n.checkoutD();
	}
	@Test(priority = 6, enabled=true)
	public void room() {
		home home_n = new home(driver);
		home_n.addroom();
	}
	@Test(priority = 7, enabled=true)
	public void adult() {
		home home_n = new home(driver);
		home_n.addAdult();
	}
	@Test(priority = 8, enabled=true)
	public void child() {
		home home_n = new home(driver);
		home_n.addChild();
	}
	@Test(priority = 9, enabled=true)
	public void ageC() {
		home home_n = new home(driver);
		home_n.ageClick();
	}
	@Test(priority = 10, enabled=true)
	public void ageSelect() {
		home home_n = new home(driver);
		home_n.ageC();
	}
	@Test(priority = 11, enabled=true)
	public void update() {
		home home_n = new home(driver);
		home_n.btnUpdate();
	}
}
