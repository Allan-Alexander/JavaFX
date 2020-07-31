/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_1_login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static jfxml_1_login.JFXML_1_Login.stage;

/**
 * FXML Controller class
 *
 * @author saji
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane pane;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void Close(MouseEvent event){
        System.exit(0);
    }
    @FXML
    private void Back_to_Menu(MouseEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       Scene scene = new Scene(root);
       stage.setScene(scene);
       
    }
    
    
}
