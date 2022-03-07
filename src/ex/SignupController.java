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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.regex.*;  
import javafx.scene.control.Alert;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * FXML Controller class
 *
 * @author vip
 */
public class SignupController implements Initializable {
    
    @FXML TextField username;
    @FXML TextField password;
    @FXML TextField email;
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
    @FXML
    public static TextField nickname1;
         

    @FXML
     public void SignUp(ActionEvent event) throws IOException{
           Matcher matcher = pattern.matcher(email.getText());
         if(username.getText().equals("") || password.getText().equals("") || email.getText().equals("") ){
           Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("please make sure to enter all fileds "); alert.show();
         }
         else if(password.getText().length()<9){
           Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("password is too short, password must be 9 charcters or more"); alert.show();
         }
         else if(!matcher.matches()){
           Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("please enter a correct email address"); alert.show();
         
         }
         
         else{
             
             
             //save user info in database 
             sign_up_in up = new sign_up_in();
            up.setUsername(username.getText());
            up.setPassword(password.getText());
            up.setEmail(email.getText());
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx2 = session.beginTransaction();
            session.save(up);
            tx2.commit();
            session.close();
             
             
             
            
             //open main ui
         Parent tableViewParent =  FXMLLoader.load (getClass().getResource("map3experiments.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;}
}
     
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
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
