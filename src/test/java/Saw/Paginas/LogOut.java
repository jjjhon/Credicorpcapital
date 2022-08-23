package Saw.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Saw.Steps.*;

import net.thucydides.core.annotations.Step;

public class LogOut {
	
	private WebDriver driver;	
	private Botones botones = new Botones (driver);

	
	// se identifican los elementos necesarios para generar el cierre se sesión 
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"logout2\"]")
	private WebElement logout;
	
	
	
public   LogOut (WebDriver driver) {
	
	// se ejecuta el cierre de sesión
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		
		
		
	}

@Step 
public void cerrar () throws InterruptedException  {
	// se realiza comparación del titulo de la pgina de agradecimientos para verificar que si se encuentra en esta
	
	System.out.println();	
	Thread.sleep(2000);
	logout.click();
	
	
	
}
	

}
