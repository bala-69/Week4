package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		
		
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		org.openqa.selenium.Point location = item4.getLocation();
		 int x=location.getX();
         int y=location.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		
		
}

}
