#Sample Feature Definition Template
@tag
Feature: saucedemo
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Compra correcta
    Given abrir el navegador
  	Then Iniciar sesion con usuario <UserNameP> y contrasena <PasswordP>
    And Agregar y eliminar productos
    Then Cerrar sesion
    
    
     Examples: 
      | UserNameP		  | PasswordP 		|
      | Automa_14 |secret_sauce 	|
       
  
