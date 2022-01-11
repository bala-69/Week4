package week4.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://erail.in/");
		WebElement source = driver.findElement(By.id("txtStationFrom"));
        source.clear();
        source.sendKeys("Chennai Egmore");
        source.sendKeys(Keys.TAB);
		
		WebElement tostation = driver.findElement(By.id("txtStationTo"));
		tostation.clear();
		tostation.sendKeys("mdu");
		tostation.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("buttonFromTo")).click();
		
		int size = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		List <String> trainames = new ArrayList<String> ();
		for (int i =1 ; i<size ; i++)
		{
		 String trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		 trainames.add(trainname);
		 
		}
		Set <String> removeduplicates = new LinkedHashSet <String> (trainames);
		int size2 = removeduplicates.size();
		System.out.println(size2);
		System.out.println(removeduplicates);
	}

}
