package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockSeleniumTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		Dimension size = d.manage().window().getSize();
		System.out.println(size);
		d.get("https://www.google.com/");
		/*
		d.findElement(By.name("q")).sendKeys("jai sri ram");
		Thread.sleep(1000);
		d.findElement(By.xpath("//li[@class='sbct']")).click();
		WebElement e = d.findElement(By.xpath("//span[contains(text(),'25-Jan-2021')]"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView(false)", e);
	*/}

}
