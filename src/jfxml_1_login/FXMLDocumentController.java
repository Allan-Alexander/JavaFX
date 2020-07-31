/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_1_login;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;
import static jfxml_1_login.JFXML_1_Login.UserName;

/**
 *
 * @author saji
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane content_area; // to load content_area --> go to FXML Document --> left click --> select (make controller);
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
   
    @FXML
    private void handleClose(MouseEvent event){
        System.exit(0);
    }
    @FXML
    private void Submit(MouseEvent event) throws IOException{
        try{
        System.out.println("Entered******************");
        String name = username.getText().toUpperCase();
        if(UserName.containsKey(name)  &&  UserName.get(name).equals(password.getText()))
        {
       
        Parent fxml = FXMLLoader.load(getClass().getResource("LoginUI.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wrong Credentials");
            username.setText(null);
            password.setText(null);
        }
        }catch( Exception e){
            username.setText(null);
            password.setText(null);
            //Submit(event);
        } 
    }
    @FXML
    private void enroll(MouseEvent event) throws IOException{
       Parent fxml = FXMLLoader.load(getClass().getResource("Enroll.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
