package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//label[@class='toggle']")).click();
WebElement findElement = driver.findElement(By.linkText("img-fluid"));
System.out.println(findElement);
}

}
