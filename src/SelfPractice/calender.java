package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/calendar/");

		
		WebElement caenderfield = driver.findElement(By.xpath("//td[text()='20']"));
		Thread.sleep(2000);
		caenderfield.click();
	}

}
