package seliniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Set Application URL
		driver.get("file:///C:/Users/admin/Desktop/Automationclass/seliniumassignments/framehandling.html");
		
		// Switch to First frame
		driver.switchTo().frame("pradeepYouTubeFirstFrame");
		
		// Click on first video Play button
		WebElement firstplaybtn = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
		firstplaybtn.click();
		Thread.sleep(2000);
		
		// Back to Parent Window or you can say come out of the first frame
		driver.switchTo().defaultContent();
		
	
		// Now Switch to Second frame
		
		driver.switchTo().frame("pradeepYouTubeSecondFrame");
		
		// Click on second video Play button
		WebElement secondplaybtn =driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
		secondplaybtn.click();
		Thread.sleep(2000);
	}

}
