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

public class reset_passController implements Initializable {

    @FXML
    TextField password_1;
    @FXML
    TextField password_2;

    @FXML

    public void reset_password(ActionEvent event) throws IOException {

        if (password_1.getText().equals(password_2.getText())) {
            if (password_1.getText().length() < 9 && password_2.getText().length() < 9) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("password is too short, password must be 9 charcters or more");
                alert.show();
            } else {
                sign_up_in in = new sign_up_in();
                Session session = HibernateUtil.getSessionFactory().openSession();
                List<sign_up_in> pList = null;
                String queryStr = "from sign_up_in";
                Query query = session.createQuery(queryStr);
                pList = query.list();
                System.out.println(validate_emailController.email_2);
                session.close();
                int i = 0;

                for (sign_up_in s : pList) {
                    i++;
                    if (s.getEmail().equals(validate_emailController.email_2)) {
                        System.out.println(validate_emailController.email_2);
                        s.setPassword(password_1.getText());
                        session = HibernateUtil.getSessionFactory().openSession();
                        Transaction tx2 = session.beginTransaction();
                        session.update(s);
                        tx2.commit();
                        session.close();

                        /*
                        String hqlUpdate = "update from sign_up_in s set s.password ='"+password_1.getText()+"' where s.email=assw.a2020@gmail.com";
                        Query queryUpdate = session.createQuery(hqlUpdate);
                        int resultU = queryUpdate.executeUpdate();
                        System.out.println("Rows affected: " + resultU);*/
                        Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                        Scene tableViewScene = new Scene(tableViewParent);
                        //his line gela the Stage informal.ion
                        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        window.setScene(tableViewScene);
                        window.show();
                    }
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("passwords are not mach");
            alert.show();

        }

    }

    @FXML
    public void backToForgot(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("validate_email.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //his line gela the Stage informal.ion
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    public void GoToLogin(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //his line gela the Stage informal.ion
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}

