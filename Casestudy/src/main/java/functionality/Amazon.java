package functionality;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Object_Repositry.Amzonclass;

public class Amazon {
	  
	      @Test
	      public void AmazonTrip() throws InterruptedException, IOException{
	    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SRI CHARAN REDDY\\Downloads\\chromedriver\\chromedriver.exe");
	  		WebDriver d1;
	  		d1 = new ChromeDriver();
            d1.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	
            
            //Register Page 
            Amzonclass.username(d1).sendKeys("sharath");
	  	    Amzonclass.Email(d1).sendKeys("sharathreddy3339@gmail.com");
	    	Amzonclass.password(d1).sendKeys("sharath@12");
	    	Amzonclass.pass_check(d1).sendKeys("sharath@12");
	    	Amzonclass.contiune_button(d1).click();
	    	
	 
	    	
	    	d1.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    	
	    	//Log in Mail details
	        Amzonclass.login_Email(d1).sendKeys("917075953695");
	   	    Amzonclass.EmailLogin_Button(d1).click();
	   	    Thread.sleep(3000);
	   	    
	   	    //d1.navigate().to("https://www.amazon.in/ap/signin");
	   	    //Password Page 
	   	    Amzonclass.login_password(d1).sendKeys("Reddy@12");
	   	    Amzonclass.loginPassword_Button(d1).click();
	   	    Thread.sleep(3000);
	   	    
	  		//Amazon Home Page and search for products
	   	    d1.get("https://www.amazon.in/");
	   	    Amzonclass.Home_pagesearch(d1).sendKeys("iphone");
	   	    d1.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	   	    
	   	    //Scroll for products
	   	    JavascriptExecutor js = (JavascriptExecutor) d1 ;
	   	    js.executeScript("scroll,(0,750)");
	   	    
	   	    //Click for product
	   	    d1.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
	   	    
	   	    //switch window
	   	    System.out.println( d1.getTitle());
	   	    d1.getWindowHandle();
	   	    Set<String> windows = d1.getWindowHandles();
			Iterator<String> iter = windows.iterator();
			String window1 = iter.next();
			String window2 = iter.next();
            
			d1.switchTo().window(window2);
			
			System.out.println(d1.getTitle());
	   	    
		/*	//Select size of item
			Select size = new Select(d1.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]")));
			size.selectByIndex(3);*/
			Thread.sleep(3000);
             
			//Add to cart
	   	    d1.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	   	    Thread.sleep(3000);

	   	    
	   	    
	   	    //Taking  screenshot as product added to cart
	   	    TakesScreenshot tk1 = (TakesScreenshot)d1;
		    File source=tk1.getScreenshotAs((OutputType.FILE));
		    File destination = new File("C:\\Users\\SRI CHARAN REDDY\\Desktop\\HCL\\New folder\\screen2.jpg");
		    FileHandler.copy(source, destination);
	   	    
	   	    	
		
	   	  
	    	
	    	
	      }}
	      
	   
	        
	  		
	


