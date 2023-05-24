package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regirstation {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Automationclass/selfPractice/reg.html");
        
		
		WebElement firstnamefield = driver.findElement(By.name("firstname"));
		firstnamefield.sendKeys("Purva");
		
		WebElement middlenamefield = driver.findElement(By.name("middlename"));
		middlenamefield.sendKeys("Mahesh");
		
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys("Navsar");
		
		WebElement coursefield= driver.findElement(By.id("cousrsetype"));
		Select cousrsetypedropdown = new Select (coursefield);
		cousrsetypedropdown.selectByVisibleText("B.Tech");
		
		WebElement femalefield =driver.findElement(By.xpath("//input[@name='female']"));
		femalefield.click();
		
		WebElement phonefield = driver.findElement(By.name("phone"));
		phonefield.sendKeys("7030309809");
		
		WebElement addressfield = driver.findElement(By.xpath("/html/body/form/textarea"));
		addressfield.sendKeys("Pune");
		
		WebElement emailfield = driver.findElement(By.name("email"));
		emailfield.sendKeys("purva95@gmail.com");
		
		WebElement passwordfield = driver.findElement(By.name("pass"));
		passwordfield.sendKeys("Pm1428@9389");
		
		WebElement repasswordfield = driver.findElement(By.name("repass"));
		repasswordfield.sendKeys("Pm1428@9389");
         
		WebElement registerbtn =driver.findElement(By.xpath("//input[@value='Submit']"));
		registerbtn.click();

		
		
	}


}
