package com.selenium.g1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D8_5 {

	public static void main(String[] args) {
		//Apple
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	
		//driver.switchTo().newWindow(WindowType.TAB);
		//Selenium
		WebDriver driver1=new ChromeDriver(co);
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		driver1.findElement(By.name("q")).sendKeys("Selenium");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getWindowHandle());
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//Cucumber
				WebDriver driver2=new ChromeDriver(co);
				driver2.manage().window().maximize();
				driver2.get("https://www.google.com");
				driver2.findElement(By.name("q")).sendKeys("Cucumber");
				driver2.findElement(By.name("q")).sendKeys(Keys.ENTER);
				System.out.println(driver2.getTitle());
				System.out.println(driver2.getWindowHandle());

	}

}
