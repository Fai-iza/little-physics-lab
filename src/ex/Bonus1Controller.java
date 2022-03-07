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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Faiza
 */
public class Bonus1Controller implements Initializable {

  
    @FXML
    private Label label;

    @FXML
    private TextField law;

    @FXML
    private TextField constant;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label11;

   
    @FXML
    private Label res;
    
      @FXML
    private Button subbb;

    @FXML
    void sub(ActionEvent event) {
        
        if(label1.getText().equalsIgnoreCase("I=V/R")&&label11.getText().equalsIgnoreCase("R")){
            label1.setStyle("-fx-text-fill: green;");
            label11.setStyle("-fx-text-fill: green;");
            Scene3_2Controller.points3=Scene3_2Controller.points3+1;
            res.setText("you got a point, your score is: "+ Scene3_2Controller.points3);
        }
        else if(label1.getText().equalsIgnoreCase("I=V/R")||label11.getText().equalsIgnoreCase("R")){
              if(label1.getText().equalsIgnoreCase("I=V/R"))
            label1.setStyle("-fx-text-fill: green;");
        else
            label1.setStyle("-fx-text-fill: red;");
        
          if(label11.getText().equalsIgnoreCase("R"))
            label11.setStyle("-fx-text-fill: green;");
        else
            label11.setStyle("-fx-text-fill: red;");
            Scene3_2Controller.points3=Scene3_2Controller.points3+0.5;
            res.setText("you got half a point, your score is: "+ Scene3_2Controller.points3);}
        else{
             res.setText("you didnt get any points");
         label1.setStyle("-fx-text-fill: red;");
            label11.setStyle("-fx-text-fill: red;");}
        
        
        subbb.setDisable(true);

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   label1.textProperty().bind(law.textProperty());
   label11.textProperty().bind(constant.textProperty());
   
  
    }    

    

    @FXML
    public void home(MouseEvent event) throws IOException {
        
     Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex3.fxml"));
     Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
    }
    
}
