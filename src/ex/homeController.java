package ex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
//public class LoginController implements Initializable {

public class homeController implements Initializable {
    
      @FXML
     public void back(ActionEvent event) throws IOException{
         Parent tableViewParent =  FXMLLoader.load (getClass().getResource("home0.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
}
    /**
     * 
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
