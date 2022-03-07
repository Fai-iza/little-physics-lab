package ex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import static ex.Sene1_2Controller.points;
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class stars_lvlsController implements Initializable {
    
    @FXML private Label pointslabel;
    @FXML
    private Label label;

    
       @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex1.fxml"));
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
        
       
        
     pointslabel.setText("        "+points+ "/4");
     if(points!=4){
         
         label.setText("                 Click next for a bonus question");
         
     
     }}
     
//    private void gobonuspage(MouseEvent event) throws IOException {
//      if(points!=4){}
//      else
//      {
//      Parent tableViewParent =  FXMLLoader.load(getClass().getResource("Bonus.fxml"));
//       Scene tableViewScene  = new Scene(tableViewParent); 
//    //his line gela the Stage informal.ion
//    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
//    window.setScene (tableViewScene);
//    window.show() ;
//      
//      }

     
        
    //}    

    @FXML
    public void gobonuspage(ActionEvent event) throws IOException {
           if(points==4){label.setText("       perfect score,no bonus question is needed");}
      else
      {
      Parent tableViewParent =  FXMLLoader.load(getClass().getResource("Bonus.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
      
      }
    }

    
    
}
