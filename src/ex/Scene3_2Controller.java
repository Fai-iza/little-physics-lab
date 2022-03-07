/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import static ex.Sene1_2Controller.points;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.management.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author ano
 */
public class Scene3_2Controller implements Initializable {
    
     
@FXML private RadioButton chris;
@FXML private RadioButton newton;
@FXML private RadioButton ohm;
@FXML private RadioButton q2true;
@FXML private RadioButton q2false;
@FXML private RadioButton q3true;
@FXML private RadioButton q3false;
@FXML private RadioButton q4true;
@FXML private RadioButton q4false;
private ToggleGroup q1;
private ToggleGroup q2;
private ToggleGroup q3;
private ToggleGroup q4;

public static double points3;
       @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load(getClass().getResource("mapex3.fxml"));
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
      q1 = new ToggleGroup();
        this.chris.setToggleGroup(q1);
        this.ohm.setToggleGroup (q1);
        this.newton.setToggleGroup(q1);
        
        q2 = new ToggleGroup();
        this.q2true.setToggleGroup(q2);
        this.q2false.setToggleGroup (q2);
        
           q3 = new ToggleGroup();
        this.q3true.setToggleGroup(q3);
        this.q3false.setToggleGroup (q3);
        
        
           q4 = new ToggleGroup();
        this.q4true.setToggleGroup(q4);
        this.q4false.setToggleGroup (q4);
        
    }
    
    public void submit(ActionEvent event) throws IOException{
        
        points3 = 0;
        
         if(this.q1.getSelectedToggle()==null||this.q2.getSelectedToggle()==null||this.q3.getSelectedToggle()==null||this.q4.getSelectedToggle()==null){
          Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("Answer all questions before submitting"); alert.show();
        }
        else{
    
    if (this.q1.getSelectedToggle().equals(this.ohm))
        points3=points3+1;
    if (this.q2.getSelectedToggle().equals(this.q2true))
        points3=points3+1;
    if (this.q3.getSelectedToggle().equals(this.q3true))
        points3=points3+1;
    if (this.q4.getSelectedToggle().equals(this.q4true))
        points3=points3+1;
    
    
    
            score sc = new score();
            Session session2 = HibernateUtil.getSessionFactory_2().openSession();
            List<score> pList = null;
            String queryStr = "from score";
             org.hibernate.Query query2 = session2.createQuery(queryStr);
            pList = query2.list();
            session2.close();
            for (score s : pList) {
                if (s.getUsername().equals(loginController.username_2)) {
                    s.setNewtons_third_low(points);
                    session2 = HibernateUtil.getSessionFactory_2().openSession();
                    Transaction tx2 = session2.beginTransaction();
                    session2.update(s);
                    tx2.commit();
                    session2.close();
                }
            }
    
    
    
    Parent tableViewParent =  FXMLLoader.load(getClass().getResource("levl3_stars.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
 
    }
    
}
