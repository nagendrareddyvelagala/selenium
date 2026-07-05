package Tecting_demoPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googledemo3 {
	WebDriver driver;
	@Test(groups= {"smoke","Regression"})
    public void googlesearch() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement username = driver.findElement(By.name("q"));
        username.sendKeys("selenium");
Thread.sleep(3000);
System.out.println("googledemo3");
        driver.quit();
}}