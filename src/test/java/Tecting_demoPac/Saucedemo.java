package Tecting_demoPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Saucedemo {

	
		WebDriver driver;
		@Test(groups= {"Priority1"})
	    public void setup() {

	        driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");

	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");

	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");

	        WebElement submit = driver.findElement(By.id("login-button"));
	        submit.click();
	        System.out.print("saucedemo");
	        driver.quit();
	    }
}

