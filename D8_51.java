package com.selenium.g1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D8_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
		driver.switchTo().newWindow(WindowType.TAB);
		//selenium
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.TAB);
		//cucumber
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		

	}

}
