package com.journaldev.jsf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.journaldev.jsf.util.DataConnect;

public class LoginDAO {
	
//	public static void test1() {
//		try {
//		WebDriver driver ;
//	System.setProperty("webdriver.chrome.driver", "C:\\developpement\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get("http://localhost:8080/JSF_Login_Logout/faces/login.xhtml");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("adam");
//		driver.findElement(By.id("password")).sendKeys("adam");
//		Thread.sleep(3000);
//		driver.findElement(By.id("bouton")).click();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	}
	
	

	public static boolean validate(String user, String pwd) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DataConnect.getConnection();
			
			
			
			
			
			ps = con.prepareStatement("Select uname, password from users where uname = ? and password = ?");
			

		
			ps.setString(1, user);
		ps.setString(2, pwd);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			DataConnect.close(con);
		}
		return false;
	}
	
	
	
	
	
	

	
	
	
	
	
	
}