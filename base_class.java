package base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.openqa.

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.home;

public class base_class {

	public WebDriver driver;
	

	@BeforeClass
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.com/");
		
		
	}

    @Test
    public void click() throws InterruptedException {
    	//JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
    	Thread.sleep(4000);
       // driver.switchTo().frame(3);
     	driver.findElement(By.xpath("(//input[@name='q'])[3]")).click();
    	driver.findElement(By.xpath("(//input[@name='q'])[3]")).sendKeys("Switzerland");
    	Thread.sleep(4000);
    	driver.findElement(By.cssSelector("div#typeahead_results a.bPaPP.w.z._S._F.Wc.Wh.Q.B-._G.bpubK > div.faliU > div.WlYyy.cPsXC.dTqpp")).click();
    	Thread.sleep(5000);
    	//driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3])")).click();
    	driver.findElement(By.cssSelector("body#BODY_BLOCK_JQUERY_REFLOW div.fgeHy.Vt.Z1.start.selected")).click();    	
    	driver.findElement(By.cssSelector("body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(3) > div:nth-child(4)")).click();
    	driver.findElement(By.cssSelector("body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(2) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span")).click();
    	
    	driver.findElement(By.cssSelector("body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3)")).click();
    	//Age
    	driver.findElement(By.cssSelector("button.fFUeN._R.Wc.Wh._m._S.Z.R2.Nc")).click();
    	//dropdown
    	driver.findElement(By.cssSelector("body#BODY_BLOCK_JQUERY_REFLOW button:nth-child(4)")).click();
    	//update
    	driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    	
    	//scroll
    	//WebElement Element = driver.findElement(By.linkText("Hotel Class"));
    	//js.executeScript("arguments[0].scrollIntoView();", Element);
    	driver.findElement(By.xpath("//span[contains(text(),'Hotel class')]")).click();
    	
    	driver.findElement(By.cssSelector("div#component_12 div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label")).click();
    	Thread.sleep(2000);
    }
	

	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	
}
