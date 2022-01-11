package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
			
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.xpath("//div[@title='Chennai Egmore']")).click();
		
driver.findElement(By.id("txtStationTo")).clear();		
driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
driver.findElement(By.id("chkSelectDateOnly")).clear();
driver.findElement(By.id("buttonFromTo")).click();
	}
}
