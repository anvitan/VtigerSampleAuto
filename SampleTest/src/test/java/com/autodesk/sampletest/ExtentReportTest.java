package com.autodesk.sampletest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportTest{
	
    ExtentReports report;
   
	
//	@BeforeSuite
//	public void loadextent()
//	{
//		report=new ExtentReports("./advancereport.html");
//        report.loadConfig(new File("./extent-config.xml"));
//	}
	
	@Test
	public void CreateOrganizationTest () throws EncryptedDocumentException, FileNotFoundException, IOException { 
		
//         ExtentTest logger = report.startTest("CreateOrganizationTest");
//         logger.log(LogStatus.INFO, "start test");
        
         
 		
 		//logger.log(LogStatus.INFO, "navigate to home page");
 		 WebDriver driver= new ChromeDriver(); 
 		driver.manage().window().maximize();
 		driver.get("http://localhost:8888/");
 		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("123456",Keys.ENTER);
		
		
       driver.findElement(By.linkText("Organizations")).click();
		String title=driver.getTitle();
// 		if(title.contains("Organizations - vtiger"))
// 			//logger.log(LogStatus.PASS,"Organization created");
// 		else
// 			logger.log(LogStatus.FAIL, "Organization not created");
// 		
 		driver.close();
 	//	report.endTest(logger);
		
	}
	
	
//	@AfterSuite
//	public void closeextent()
//	{
//		report.flush();
//		report.close();
//	}
	
	

}
