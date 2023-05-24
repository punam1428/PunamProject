package seliniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inbox_without_sendkey {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// use for open chrome

		driver.get("file:///C:/Users/admin/Desktop/Automationclass/seliniumassignments/input_without_sendkey.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='channelname']"));
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value=arguments[1]", firstname,"Punam");
	}

}
