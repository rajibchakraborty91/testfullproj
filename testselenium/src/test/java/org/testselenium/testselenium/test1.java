package org.testselenium.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

@Test	
	public void sysomethod() {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "D:/Doc.view/chromedriver2/chromedriver.exe");
		
		WebDriver ds = new ChromeDriver();
		
		ds.get("https://davies-group.com/");
		
		ds.manage().window().maximize();
		
		ds.findElement(By.xpath("//a[contains(@href,'search')]")).click();
		
		
		
		ds.findElement(By.xpath("//input[@type='text'][@id='eut_search_5e67a62c0fff2']")).click();
		
		*/
	System.out.println("login");	
	
	
		
	}

@Test(dependsOnMethods = "sysomethod" )
public void logout()
{
	System.out.println("log out method");
}

}
