package Saw.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class Botones {
	
private WebDriver driver;
	
	@FindBy(how = How.ID, using = "user-name")
	private WebElement User;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement pass;
	
	@FindBy(how = How.ID, using = "login-button")
	private WebElement login;
	
	@FindBy(how = How.XPATH,  using = "//div[@id='header_container']/div[2]/div[2]/span/select")
	private WebElement AZ;
	
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement jacket;
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private WebElement backpack;
	
	
	@FindBy(how = How.ID, using = "remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(how = How.XPATH,  using = "//div[@id='shopping_cart_container']/a")
	private WebElement carrito;
	
	@FindBy(how = How.ID, using = "checkout")
	private WebElement checkout;

	
	@FindBy(how = How.ID, using = "first-name")
	private WebElement pname;
	
	
	@FindBy(how = How.ID, using = "last-name")
	private WebElement lname;
	
	
	@FindBy(how = How.ID, using = "postal-code")
	private WebElement pcode;
	
	
	@FindBy(how = How.ID, using = "continue")
	private WebElement conti;
	
	
	@FindBy(how = How.ID, using = "finish")
	private WebElement finish;

	@FindBy(how = How.ID, using = "back-to-products")
	private WebElement back;
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private WebElement react;
	
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private WebElement logout;
	
	

	
	
	public Botones(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

}
	
	@Step
	public void scrollBajar() {
		 WebElement continuar = driver.findElement(By.id("continue"));
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
	       scroll.executeScript("window.scrollBy(0,250)");
	       
	     
		        
	}
	
	@Step
	public void scrollSubir() {
		 WebElement react = driver.findElement(By.id("react-burger-menu-btn"));
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
	       scroll.executeScript("window.scrollBy(0,-250)");
	       
	     
		        
	}

}
