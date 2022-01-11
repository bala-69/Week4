package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		//single text from coloumn
		String text = driver.findElement(By.xpath("//table[@id='table_id']//tr[1]/td[2]")).getText();
		System.out.println(text);
		
		//all the coloumn details from a particular row 
        for (int i = 1 ; i < 4 ; i++)
        {
        String details = driver.findElement(By.xpath("//table[@id='table_id']//tr[1]/td["+i+"]")).getText();
        System.out.println(details);
        }
        
        //all the row count and details 
		
        int size = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
        List <String> tabledetails = new ArrayList <String>();
        
        
        
        for ( int a = 2 ; a <size ; a++)
        {
        	for ( int b = 1 ; b <4 ; b++)
        	{
        		String detail = driver.findElement(By.xpath("//table[@id='table_id']//tr["+a+"]/td["+b+"]")).getText();
        		tabledetails.add(detail);
        		
        	}
        }
      
        System.out.println(tabledetails);
     
        driver.findElement(By.xpath("//table[@id='table_id']//tr/th[2]")).click();
        int size2 = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
        List <String> header = new ArrayList <String>();
        for (int c = 2 ; c<size2 ; c++ )
        {
        	for (int d = 1 ; d<4; d++)
        	{
        		String text2 = driver.findElement(By.xpath("//table[@id='table_id']//tr["+c+"]/td["+d+"]")).getText();
            	header.add(text2);
        		
        	}
        	
        	
        }
        
        System.out.println(header);
	
	
	
	
	if (tabledetails.equals(header)==true)	
	{
		System.out.println("both are equal ");
	}
	else
	{
		System.out.println("not equal ");
	}
	

}
}