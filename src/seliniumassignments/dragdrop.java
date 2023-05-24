package seliniumassignments;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();// use for open chrome

		driver.get("file:///C:/Users/admin/Desktop/Automationclass/seliniumassignments/drag_drop.html");
		// use for open perticular link
		
		driver.manage().window().maximize();
		
	
		
		WebElement logo = driver.findElement(By.xpath("//*[@id='drag1']"));
		WebElement squrebox = driver.findElement(By.xpath("//div[@id='div6']"));
		
		Thread.sleep(2000);
		dragAndDrop(driver,logo,squrebox);

	}

	

	public static void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement tarElement) {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
		                      + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
		                      + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
		                      + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
		                      + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
		                      + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
		                      + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
		                      + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
		                      + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
		                      + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
		                      + "var dropEvent = createEvent('drop');\n"
		                      + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
		                      + "var dragEndEvent = createEvent('dragend');\n"
		                      + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
		                      + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
		                      + "simulateHTML5DragAndDrop(source,destination);", srcElement, tarElement);
		 }

}
