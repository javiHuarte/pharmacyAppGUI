/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyappgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Usuario
 */


 import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class pantallaInicioController {

    @FXML
    private Button login;

    @FXML
    private Button createAccount;

    @FXML
    void createAccount(ActionEvent event) {
        try{
	  Parent root = FXMLLoader.load(getClass().getResource("createAccount.fxml")); 
	  Scene scene = new Scene(root);
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		
	  stage.setScene(scene);
	  stage.show();
	  } catch(Exception e) {
	  	e.printStackTrace();
	  }

    }

    @FXML
    void logIn(ActionEvent event) {
        try{
	  Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml")); 
	  Scene scene = new Scene(root);
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		
	  stage.setScene(scene);
	  stage.show();
	  } catch(Exception e) {
	  	e.printStackTrace();
	  }
	}
		

    }





