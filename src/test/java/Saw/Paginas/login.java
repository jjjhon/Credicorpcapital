package Saw.Paginas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import SawTest.*;
import net.thucydides.core.annotations.Step;

public class login {

	private WebDriver driver;	
	
	private Saw.Steps.Botones botones = new Saw.Steps.Botones (driver);
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"signin2\"]")
	private WebElement Signin2;
	
	@FindBy(how = How.ID, using = "sign-username")
	private WebElement User;
	
	@FindBy(how = How.ID, using = "sign-password")
	private WebElement pass;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	private WebElement SignUp;
	
	@FindBy(how = How.XPATH,  using = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	private WebElement Enter;
	
	@FindBy(how = How.ID, using = "login2")
	private WebElement Login;
	
	@FindBy(how = How.ID, using = "loginusername")
	private WebElement UserL;
	
	@FindBy(how = How.ID, using = "loginpassword")
	private WebElement PassL;

	@FindBy(how = How.XPATH, using = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement LogininModal;


public  login (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Saw.Steps.Botones(driver);
		
		
	}


@Step 
public void RegistroLogin (String UsernameP, String PasswordP) throws InterruptedException {
	
	Signin2.click();
	User.sendKeys(UsernameP);
	pass.sendKeys(PasswordP);
	SignUp.click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	//Enter.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	Login.click();
	UserL.sendKeys(UsernameP);
	PassL.sendKeys(PasswordP);
	LogininModal.click();
	Thread.sleep(3000);
	 	
}


	
}
