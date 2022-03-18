/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyappgui;

/**
 *
 * @author agarc
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import db.sqlite.JPAUserManager;
import db.interfaces.UserManager;
import java.security.MessageDigest;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.Window;
import pojos.User;

/**
 *
 * @author agarc
 */
public class CreateAccountController {
    private static UserManager usermanager = new JPAUserManager();
     @FXML
    private Button createButton;
     
     @FXML
    private TextField username;

    @FXML
    private PasswordField password1;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    void createAccount(ActionEvent event) {
      
    
}
}

