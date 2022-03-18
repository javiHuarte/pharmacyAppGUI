/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyappgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import db.sqlite.JPAUserManager;
import db.interfaces.UserManager;

/**
 *
 * @author agarc
 */
public class CreateAccountController {
     @FXML
    private Button createButton;
     
       @FXML
    private TextField usernametext;

    @FXML
    private PasswordField password1text;

    @FXML
    private PasswordField password2test;

    @FXML
    void CreateAccount(ActionEvent event) {
        

    }

    
}
