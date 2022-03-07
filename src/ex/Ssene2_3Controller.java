/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

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
 * @author ano
 */
public class Ssene2_3Controller implements Initializable {
    
    
       @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex2.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
 
    }
    
    
    
       @FXML
    public void sound(ActionEvent event) throws IOException{
        
   
 
    }
    
    
       @FXML
    public void next(ActionEvent event) throws IOException{
        
  
 
    }
    
       @FXML
    public void prev(ActionEvent event) throws IOException{
        
  
 
    }

    
       @FXML
    public void start(ActionEvent event) throws IOException{
        
  
 
    }
    
    
       @FXML
    public void pause(ActionEvent event) throws IOException{
        
  
 
    }
    
    
       @FXML
    public void redo(ActionEvent event) throws IOException{
        
  
 
    }



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
