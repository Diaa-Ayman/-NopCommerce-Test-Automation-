package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Submitform  extends Base {

	
	
	public Submitform(WebDriver driver) {
		
		super(driver);
	}
	
	
	By Name =By.cssSelector("input.setInput_input__A7zV6") ;
	By Email =By.cssSelector("input.setInput_input__A7zV6") ;
	By mass =By.xpath("//*[@id=\"__next\"]/div[2]/div[8]/div/div[2]/form/div[2]/div/div") ;
	By send_btn = By.cssSelector("button.B") ;
	
	
	 
	 
	 public void submit ( String name ,String email ,String massage)
	 {
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(mass).sendKeys(massage);
		
	 }
	 

}
