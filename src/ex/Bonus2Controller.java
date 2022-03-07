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
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Faiza
 */
public class Bonus2Controller implements Initializable {

    @FXML
    private ImageView pend;
    @FXML
    private ImageView newton;
    @FXML
    private ImageView ohm;
    @FXML
    private Label label;
    @FXML
    private ImageView xnewton;
    @FXML
    private ImageView pendx;
    @FXML
    private ImageView xohm;
    @FXML
    private ImageView ticknewton;
    @FXML
    private Text ohmAns;
    @FXML
    private Text pendAns;
    @FXML
    private Pane ohmPane;
    @FXML
    private Pane newtonPane;
    @FXML
    private Pane pendPane;
    @FXML
    private ImageView tickpend1;
    @FXML
    private ImageView tickohm;
    @FXML
    private Text NwetonAns;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("1- click the text that you want to move\n"
                + "2- use the arrow keys to move the text to the correct box\n"
                + "\n"
                + "Note* you can try multiple times until you get it right");
        a.show();


    }    

    @FXML
    public void home(MouseEvent event) throws IOException {
        
     Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex2.fxml"));
     Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
    }

    @FXML
    public void Done(ActionEvent event) {
        
        
        
        double yn=NwetonAns.getX();
        if ((NwetonAns.getY()==-80 ||NwetonAns.getY()==-75) && ( -150<=yn&&yn<=-135)){
            ticknewton.setVisible(true);
            xnewton.setVisible(false);
           
            if(!NwetonAns.isDisabled())
            Scene2_2Controller.points2=(int) (Scene2_2Controller.points2+0.36);
        label.setText("You got a bonus point, your score is:"+Scene2_2Controller.points2);  
         NwetonAns.setDisable(true);}
        else{
          xnewton.setVisible(true);
           ticknewton.setVisible(false);   
        }
        
          if ((pendAns.getY()==-80 || pendAns.getY()==-75) &&  (pendAns.getX()>=270 && pendAns.getX()<=330) ){           
            tickpend1.setVisible(true);
            pendx.setVisible(false);
           
            if(!pendAns.isDisabled())
            Scene2_2Controller.points2=(int) (Scene2_2Controller.points2+0.35);
            label.setText("You got a bonus point, your score is:"+Scene2_2Controller.points2);
 pendAns.setDisable(true);          }
        else{
        pendx.setVisible(true);
        tickpend1.setVisible(false);
        }
       if((ohmAns.getY()==-80 |ohmAns.getY()==-75)&( ohmAns.getX()>=-180) && ohmAns.getX()<=-120){
                     tickohm.setVisible(true);
                     xohm.setVisible(false); 
                   
                     if(!ohmAns.isDisabled())
                        exp3_toolsController.points2=Scene2_2Controller.points2+0.29;
        label.setText("You got a bonus point, your score is:"+Scene2_2Controller.points2);  
         ohmAns.setDisable(true);}
        else{
             tickohm.setVisible(false);   
             xohm.setVisible(true);
        }
    }
    

    @FXML
    public void MoveNewton(KeyEvent e) {
        if (e.getCode() == KeyCode.UP) {
NwetonAns.setY(NwetonAns.getY()-5);
}
else if (e.getCode() == KeyCode.DOWN) {
NwetonAns.setY(NwetonAns.getY()+5);
}
else if (e.getCode() == KeyCode.RIGHT) {
NwetonAns.setX(NwetonAns.getX()+5);
}
else if (e.getCode() == KeyCode.LEFT) {
NwetonAns.setX(NwetonAns.getX()-5);
}

//NwetonAns.requestFocus();
e.consume();
    }

    @FXML
    public void moveOhm(KeyEvent e) {
                if (e.getCode() == KeyCode.UP) {
ohmAns.setY(ohmAns.getY()-5);
}
else if (e.getCode() == KeyCode.DOWN) {
ohmAns.setY(ohmAns.getY()+5);
}
else if (e.getCode() == KeyCode.RIGHT) {
ohmAns.setX(ohmAns.getX()+5);
}
else if (e.getCode() == KeyCode.LEFT) {
ohmAns.setX(ohmAns.getX()-5);
}

//NwetonAns.requestFocus();
e.consume();
    }

    @FXML
    public void MovePen(KeyEvent e) {
              if (e.getCode() == KeyCode.UP) {
pendAns.setY(pendAns.getY()-5);
}
else if (e.getCode() == KeyCode.DOWN) {
pendAns.setY(pendAns.getY()+5);
}
else if (e.getCode() == KeyCode.RIGHT) {
pendAns.setX(pendAns.getX()+5);
}
else if (e.getCode() == KeyCode.LEFT) {
pendAns.setX(pendAns.getX()-5);
}

//NwetonAns.requestFocus();
e.consume();
    }

    @FXML
    public void MoveN(MouseEvent event) {
        NwetonAns.requestFocus();
        
    }

    @FXML
    public void MoveO(MouseEvent event) {
        ohmAns.requestFocus();
    }

    @FXML
    public void MoveP(MouseEvent event) {
        pendAns.requestFocus();
    }
    
}
