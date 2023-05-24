package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();// use for open chrome

		driver.get("file:///C:/Users/admin/Desktop/Automationclass/WebSite/WebSite/WebSiteOLD/UserRegistration.html");
		// use for open perticular link

		WebElement firstnamefield = driver.findElement(By.id("fname"));

		firstnamefield.sendKeys("Punam");

		WebElement middlenamefield = driver.findElement(By.id("mname"));

		middlenamefield.sendKeys("Mahesh");

		WebElement lastnamefield = driver.findElement(By.id("lname"));

		lastnamefield.sendKeys("Navsar");
		
		WebElement marrietal = driver.findElement(By.name("marital"));

		marrietal.sendKeys("married");
		
		WebElement gender = driver.findElement(By.name("gender"));

		gender.sendKeys("female");
		WebElement subject = driver.findElement(By.name("selenium"));

		subject.sendKeys("selenium");


	}

}
