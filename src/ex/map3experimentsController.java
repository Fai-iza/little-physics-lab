package ex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class map3experimentsController implements Initializable {
    
     Boolean first=true;
   static  Boolean second=false;
   static  Boolean third=false;
    @FXML
    private Label namelbl;
   
     
     
        @FXML
     public void firstex(ActionEvent event) throws IOException{
         
         if(first){
               Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex1.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
         else{
         Alert alert = new Alert(AlertType.ERROR); alert.setTitle("finish previus expermint before starting a new one");
         alert.show();
         }
}
     
        @FXML
     public void secondex(ActionEvent event) throws IOException{
          if(second){
         Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex3.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
      else{
         Alert alert = new Alert(AlertType.ERROR);  alert.setContentText("finish previus expermint before starting a new one"); alert.show();
         }
}
     
     
        @FXML
     public void thirdex(ActionEvent event) throws IOException{
          if(third){
      Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex2.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
      else{
         Alert alert = new Alert(AlertType.ERROR);
         alert.setContentText("finish previus expermint before starting a new one"); alert.show();
         }
}


     public void aboutUs(ActionEvent event) throws IOException{
         
               Parent tableViewParent =  FXMLLoader.load (getClass().getResource("home.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
     
}
    
     
         @FXML
     public void back(ActionEvent event) throws IOException{
         
              Alert a = new Alert(AlertType.CONFIRMATION);   a.setContentText("This will take you back to HomePage, where you have to login again"
                 );  
                      a.setTitle("Return warning");
	a.setHeaderText("Do you want to go back to HomePage?");
         //a.show();
                      Optional<ButtonType> result = a.showAndWait();
	if(!result.isPresent() || result.get() != ButtonType.OK) {
		//return false;
	} else {
       Parent tableViewParent =  FXMLLoader.load (getClass().getResource("home0.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
        //his line gela the Stage informal.ion
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene (tableViewScene);
        window.show() ;}
     
}
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      //  namelbl.textProperty().bind(SignupController.nickname1.textProperty());
    }    
    
}
