package seliniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retriveinputtext {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Automationclass/seliniumassignments/retriveinputtype.html");
		
		driver.manage().window().maximize();
		
		WebElement channelname= driver.findElement(By.xpath("//input[@class='schoolNameClass']"));
		
		String ch=channelname.getAttribute("value");
		
		System.out.println(ch);

	}

}
