package ex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class loginController implements Initializable {

    @FXML
    TextField username;
    @FXML
    TextField password;

    static String username_2;

    @FXML
    public void SignUp(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //his line gela the Stage informal.ion
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    public void login(ActionEvent event) throws IOException {

        boolean flag = true;

        if (username.getText().equals("") || password.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("please make sure to enter all fileds ");
            alert.show();
        } //else if(data isnt in databse) {  Alert alert = new Alert(Alert.AlertType.ERROR);  alert.setContentText("please make sure entered password and username are correct "); alert.show();}
        else {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<sign_up_in> pList = null;
            Query query = session.createQuery("from sign_up_in");
            pList = query.list();
            session.close();

            boolean flag2 = false;
            for (sign_up_in s : pList) {
                if (s.getUsername().equals(username.getText()) && s.getPassword().equals(password.getText())) {
                    flag = false;
                    username_2 = username.getText();
                    Session session2 = HibernateUtil.getSessionFactory_2().openSession();
                    List<score> qList = null;
                    Query query2 = session2.createQuery("from score");
                    qList = query2.list();
                    session2.close();
                    for (score c : qList) {
                        if (s.getUsername().equals(c.getUsername())) {
                            flag2 = false;
                        }
                    }
                }
            }
            if (flag2) {
                score q = new score();
                q.setUsername(username.getText());
                Session session3 = HibernateUtil.getSessionFactory_2().openSession();
                Transaction tx2 = session3.beginTransaction();
                session3.save(q);
                tx2.commit();
                session3.close();

            }
            if (flag == false && flag2 == true || flag == false && flag2 == false) {
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("map3experiments.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //his line gela the Stage informal.ion
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("please make sure entered password and username are correct ");
                alert.show();

            }

        }

 
    }


@FXML
        public void forgootPassword(ActionEvent event) throws IOException{
         Parent tableViewParent =  FXMLLoader.load (getClass().getResource("validate_email.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
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
