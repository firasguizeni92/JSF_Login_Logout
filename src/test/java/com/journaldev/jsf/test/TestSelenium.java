package com.journaldev.jsf.test;



	
	
	
	
	
import static org.junit.Assert.*;	

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    driver.get(baseUrl + "/JSF_Login_Logout/faces/login.xhtml");
    assertEquals("login", driver.getTitle());
    driver.findElement(By.id("j_idt5:username")).clear();
    driver.findElement(By.id("j_idt5:username")).sendKeys("firas");
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
