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
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
import static jfxml_1_login.JFXML_1_Login.UserName;
import static jfxml_1_login.JFXML_1_Login.stage;

/**
 * FXML Controller class
 *
 * @author saji
 */
public class EnrollController implements Initializable {
    
    
    @FXML
    private AnchorPane enroll_pane;
    @FXML
    private JFXTextField eusername = null;
    @FXML
    private JFXPasswordField epassword = null;
    @FXML
    private JFXPasswordField everify = null;
    /**
     * Initializes the controller class.
     */
    
    
     @FXML
    private void Sign_up(MouseEvent event) throws IOException {
        try{
        if(!eusername.getText().equals("") && epassword.getText()!=null&& eusername.getText()!=null && epassword.getText().equals(everify.getText())){
            UserName.put(eusername.getText().toUpperCase(), epassword.getText());
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
    } else{
      JOptionPane.showMessageDialog(null, "Password Mismatch");
      eusername.setText(null);
      epassword.setText(null);
      everify.setText(null);
        }
        }catch(Exception e){
          
          eusername.setText(null);
          epassword.setText(null);
          everify.setText(null);
          //Sign_up(event);
        }
    }
      @FXML
    private void Main(MouseEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         Scene scene = new Scene(root);
         stage.setScene(scene);
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
}
    

   
    

