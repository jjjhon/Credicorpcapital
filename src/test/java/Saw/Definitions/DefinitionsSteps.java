package Saw.Definitions;

import org.openqa.selenium.WebDriver;
import Saw.Steps.*;
import Saw.Paginas.*;

import Saw.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	
	private login  Login; 
	private compra Compra;
	private LogOut logOut;

	
	//private Registro registro;
	
@Given("^abrir el Navegador$")
	public void abrir_el_navegador() {		
	this.conexion = new Conexion();
	this.driver = this.conexion.abrirNavegador();
	
		

	}

@Then("^Iniciar sesion con usuario (.*) y contrasena (.*)$")
public void diligenciarloscampos (String UserNameP, String PasswordP ) throws InterruptedException {
		   
	this.Login = new login(driver);
    this.Login.RegistroLogin(UserNameP, PasswordP);
    
	
}



@And("^Agregar y eliminar productos$")
public void agregar_y_eliminar_productos() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	  this.Compra = new compra(driver);
	  this.Compra.Agregar();

}


@Then("^Cerrar sesion$")
public void cerrar_sesi_n() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	this.logOut = new LogOut (driver);
	this.logOut.cerrar();
   
}

}