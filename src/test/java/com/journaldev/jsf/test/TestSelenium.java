package com.journaldev.jsf.test;



	
	
	
	
	


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.omg.CORBA.PRIVATE_MEMBER;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.journaldev.jsf.beans.Login;

public class TestSelenium  {
  private WebDriver driver;
 
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\developpement\\chromedriver.exe");
	  driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/";
    Dimension d = new Dimension(1382,744); 
  //Resize the current window to the given dimension
  driver.manage().window().setSize(d); 
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    
	  driver.get(baseUrl + "/JSF_Login_Logout/faces/login.xhtml");
    //assertEquals("login", driver.getTitle());

//    driver.switchTo().defaultContent();
	  driver.findElement(By.id("j_idt5:username")).clear();
	 // driver.switchTo().defaultContent();
    driver.findElement(By.id("j_idt5:username")).sendKeys("firas");
    //driver.switchTo().defaultContent();
    driver.findElement(By.id("j_idt5:username")).clear();
   driver.findElement(By.id("j_idt5:username")).sendKeys("firas");
    driver.findElement(By.id("j_idt5:password")).clear();
    driver.findElement(By.id("j_idt5:password")).sendKeys("firas");
    driver.findElement(By.id("j_idt5:password")).clear();
   driver.findElement(By.id("j_idt5:password")).sendKeys("firas");
    driver.findElement(By.id("j_idt5:bb")).click();
   // driver.findElement(By.id("j_idt5:bb")).click();
    Thread.sleep(3000);
  assertEquals("Facelet Title", driver.getTitle());
    assertEquals("Facelet Title", driver.getTitle());
    driver.findElement(By.id("j_idt5:nn")).click();
   // driver.findElement(By.id("j_idt5:nn")).click();
    assertEquals("login", driver.getTitle());
   // assertEquals("login", driver.getTitle());
    driver.findElement(By.id("j_idt5:username")).clear();
    driver.findElement(By.id("j_idt5:username")).sendKeys("nn");
    driver.findElement(By.id("j_idt5:username")).clear();
    //driver.findElement(By.id("j_idt5:username")).sendKeys("WrongName");
    //driver.findElement(By.id("j_idt5:password")).clear();
    driver.findElement(By.id("j_idt5:password")).sendKeys("nn");
    driver.findElement(By.id("j_idt5:password")).clear();
   // driver.findElement(By.id("j_idt5:password")).sendKeys("wrongPSW");
    driver.findElement(By.id("j_idt5:bb")).click();
   // driver.findElement(By.id("j_idt5:bb")).click();
    assertEquals("login", driver.getTitle());
   // assertEquals("login", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
  //  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }


	
	
	
	
	
	
//	public static void main(String[] args) {
//		TestSelenium ts = new TestSelenium();
//		try {
//			ts.setUp();
//			ts.testSelenium();
//		} catch (Exception e) {
//			System.out.println("error ya firas");
//			e.printStackTrace();
//		}
//
//	}

}
