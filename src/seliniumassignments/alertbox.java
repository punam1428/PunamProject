package seliniumassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) throws InterruptedException {
	 

				ChromeDriver driver = new ChromeDriver();// use for open chrome

				driver.get("file:///C:/Users/admin/Desktop/Automationclass/alertbox.html");
				// use for open perticular link
				
				//simple alert
				WebElement simplealertbtn =driver.findElement(By.xpath("//button[text()='Simple Alert']"));
				simplealertbtn.click();
				Thread.sleep(2000);
				Alert simplealertbox = driver.switchTo().alert();
				simplealertbox.accept();
				
				//prompt alert
				WebElement promptalertbtn =driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
				promptalertbtn.click();
				Thread.sleep(2000);
				Alert promptalertbox = driver.switchTo().alert();
				promptalertbox.sendKeys("Let Make Automation easy");
				simplealertbox.accept();
				
				//coinfirmation alert
				WebElement confirmalertbtn =driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
				confirmalertbtn.click();
				Thread.sleep(2000);
				Alert confirmalertbox = driver.switchTo().alert();
				confirmalertbox.dismiss();;
				
				
				

	}

}
