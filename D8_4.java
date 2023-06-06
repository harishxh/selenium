package com.selenium.g1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open browser
				WebDriverManager.chromedriver().setup();
		    	ChromeOptions co=new ChromeOptions();
		    	co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				//open url
				driver.get("https://www.abhibus.com/bus-ticket-booking");
				//enter src,dest location
				driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
				driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Chennai");
				
				//set value attribute for datepicker
				WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('value', '21/10/2023')",datepick);
				

	}

}
