package Saw.Paginas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Saw.Steps.*;
import net.thucydides.core.annotations.Step;

public class compra {

	
	
	private WebDriver driver;	
	private Botones botones = new Botones (driver);
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Samsung galaxy s6')]")
	private WebElement Celular;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tbodyid\"]/div[2]/div/a")
	private WebElement AddToCard;
	
	
	
public  compra (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		
	}
@Step 
public void Agregar () throws InterruptedException {
	// se añaden dos productos al carrito
	Celular.click();
	AddToCard.click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	
}
}
