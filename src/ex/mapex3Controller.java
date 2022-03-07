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
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class mapex3Controller implements Initializable {
    
   static int countit=1;
      
    @FXML
    public void learn(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("Scene3.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
 
    }
    
    @FXML
    public void test(ActionEvent event) throws IOException{
        
        
             
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("scene3_2.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
    
    countit=6;
        

 
    }
    
    @FXML
    public void explain(ActionEvent event)throws IOException{
        if(countit==6){
        Parent tableViewParent =  FXMLLoader.load (getClass().getResource("Scene5.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
         else{
        
          Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("finish previus levels before starting a new one"); alert.show();
            
        }

 
    }
    
    @FXML
    public void experment(ActionEvent event) throws IOException{
        if(countit==6){
           Parent tableViewParent =  FXMLLoader.load (getClass().getResource("scene3_3.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
    
     map3experimentsController.third=true;} else{
        
          Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("finish previus levels before starting a new one"); alert.show();
            
        }

 
    }
    

    @FXML
    public void backToMAIN(ActionEvent event) throws IOException{
        
       Parent tableViewParent =  FXMLLoader.load (getClass().getResource("map3experiments.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;

 
 
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
