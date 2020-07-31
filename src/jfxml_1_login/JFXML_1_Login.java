/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_1_login;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;

/**
 *
 * @author saji
 */
public class JFXML_1_Login extends Application {

   //
    protected static HashMap<String,String> UserName = new HashMap<String,String>();
    
    public static Stage stage=null;
    @FXML
    private AnchorPane pane;
    @FXML
    private Pane content_area;
    @FXML
    private AnchorPane enroll_pane;
    
    private double xoffset;
    private double yoffset;
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        root.setOnMousePressed(event ->{
                 xoffset = event.getSceneX();
                 yoffset = event.getSceneY();
        }
        );
        root.setOnMouseDragged(e->{
                 stage.setX(e.getScreenX()-xoffset);
                 stage.setY(e.getScreenY()-yoffset);
                 
        });
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        this.stage = stage;
        stage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
