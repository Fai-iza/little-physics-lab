/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

//import static ex.Scene2_2Controller.points2;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Faiza
 */
public class Lvl2_starController implements Initializable {

    
    @FXML private Label pointslabel;
    @FXML
    private Label label;

    
       @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex2.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
 
    }
    
 //   private Sene1_2Controller sene1_2Controller;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     pointslabel.setText("      "+Scene2_2Controller.points2+"/4.0");
        if(Scene2_2Controller.points2!=4){
         
         label.setText("               Click next for a bonus question");
         
//       
//       
//        // TODO
        
    }} 

    @FXML
    public void gobonuspage(ActionEvent event) throws IOException {
         

          if(Scene2_2Controller.points2==4){  label.setText("     perfect score,no bonus question is needed");}
      else
      {
         
      Parent tableViewParent =  FXMLLoader.load(getClass().getResource("Bonus2.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
      
      }
    }
}
