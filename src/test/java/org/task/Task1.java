package org.task;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestngTask\\excel\\Book2.xlsx");
	FileInputStream fin = new FileInputStream(file);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell cell = r.getCell(0);
	System.out.println(cell);
	
	
	
	
}
}
