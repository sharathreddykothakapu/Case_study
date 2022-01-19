

package Object_Repositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amzonclass{
	
	public static WebElement username(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		}
	public static WebElement Email(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		} 
	public static WebElement pass_check(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
	}
	
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[1]/input"));
		} 
	public static WebElement contiune_button(WebDriver d1) {
		return d1.findElement(By.xpath("//input[@type='submit']"));
		} 
	public static String window_switch1(WebDriver d1) {
		return d1.getWindowHandle();
		} 
	public static WebElement  login_Email(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		}
	public static WebElement  EmailLogin_Button(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"continue\"]"));
		}
	public static WebElement  login_password(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		}
	public static WebElement  loginPassword_Button(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		}
	public static WebElement  Home_pagesearch(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));  
		}
	public static WebElement  product(WebElement d1) {
		return d1.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/span/div/div/div/div/div[3]/div[2]/h2/a/span"));
		}
	public static WebElement  Add_cart(WebElement d1) {
		return d1.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		}
	
	

}
