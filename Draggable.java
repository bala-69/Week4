package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		drag.click();
		builder.dragAndDropBy(drag, 10, 15).perform();
		
		
		
		
		
		

	}

}
