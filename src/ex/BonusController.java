/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
 * @author Faiza
 */
public class BonusController implements Initializable {

    @FXML
    private ImageView x3;
    @FXML
    private ImageView x2;
    @FXML
    private Label label;
    @FXML
    private ImageView x1;
    @FXML
    private ImageView tick;
    @FXML
    private ImageView dk;
    @FXML
    private ImageView pend;
    @FXML
    private ImageView newton;
    @FXML
    private ImageView ohm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void hy(MouseEvent event) {
        
        
        x1.setVisible(true);
        x2.setVisible(true);
        x3.setVisible(true);
        tick.setVisible(true);
        if(!label.isDisabled())
        label.setText("Sorry, you didnt get the bonus point");
        label.setDisable(true);
         pend.setDisable(true);
         newton.setDisable(true);
         dk.setDisable(true);
         ohm.setDisable(true);
        
    }

    @FXML
    public void pend(MouseEvent event) {
        
        x1.setVisible(true);
         x2.setVisible(true);
          x3.setVisible(true);
           tick.setVisible(true);
             if(!label.isDisabled()){
                 Sene1_2Controller.points=Sene1_2Controller.points+1;
        label.setText("You got a bonus point, your score is:"+Sene1_2Controller.points);
             }
        label.setDisable(true);
          pend.setDisable(true);
         newton.setDisable(true);
         dk.setDisable(true);
         ohm.setDisable(true);
        
    }

    @FXML
    public void newton(MouseEvent event) {
        
        x1.setVisible(true);
         x2.setVisible(true);
          x3.setVisible(true);
           tick.setVisible(true);
        if(!label.isDisabled())
         label.setText("Sorry, you didnt get the bonus point");
        label.setDisable(true);
          pend.setDisable(true);
         newton.setDisable(true);
         dk.setDisable(true);
         ohm.setDisable(true);
    }

    @FXML
    public void ohm(MouseEvent event) {
        x1.setVisible(true);
         x2.setVisible(true);
          x3.setVisible(true);
           tick.setVisible(true);
             if(!label.isDisabled())
        label.setText("Sorry, you didnt get the bonus point");
        label.setDisable(true);
          pend.setDisable(true);
         newton.setDisable(true);
         dk.setDisable(true);
         ohm.setDisable(true);
    }

    @FXML
    public void home(MouseEvent event) throws IOException {
        
     Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex1.fxml"));
     Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
    }
    
    
}
