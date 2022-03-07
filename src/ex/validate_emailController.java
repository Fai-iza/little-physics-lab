package ex;

import com.email.durgesh.Email;
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

public class validate_emailController implements Initializable {

    @FXML
    public TextField email;
    @FXML
    TextField code;
    int random_int = (int) Math.floor(Math.random() * (9999 - 1001 + 1) + 1001);
    String rand = (String.valueOf(random_int));
    public String em ;
    
    public static String username_2;
    public static String email_2;

    
    @FXML
    public void send(ActionEvent event) throws IOException {
        if (email.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("please enter an email address");
            alert.show();
        } else {
            sign_up_in in = new sign_up_in();
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<sign_up_in> pList = null;
            String queryStr = "from sign_up_in";
            Query query = session.createQuery(queryStr);
            pList = query.list();
            session.close();
            boolean flag = true;
            for (sign_up_in s : pList) {
                if (s.getEmail().equals(email.getText())) {
                    flag = false;
                      email_2 = email.getText();
                    try {
                        Email email = new Email("afrah.ibra.alsaadi@gmail.com", "afrah2000");
                        email.setFrom("afrah.ibra.alsaadi@gmail.com", "Physics Lab Game");
                        email.setSubject(" Reset your password");
                        email.setContent(rand, "text/html");
                        email.addRecipient(email_2);
                        email.send();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (flag) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("please make sure entered email is correct ");
                alert.show();

            }
        }

    }

    @FXML
    public void reset(ActionEvent event) throws IOException {
        System.out.println(rand);
        if (code.getText().equals(rand)) {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("reset_pass.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            //his line gela the Stage informal.ion
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("code is incorrect");
            alert.show();
        }

    }

    @FXML
    public void resend(ActionEvent event) throws IOException {
        if (email.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("please enter an email address");
            alert.show();
        } else {
            sign_up_in in = new sign_up_in();
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<sign_up_in> pList = null;
            String queryStr = "from sign_up_in";
            Query query = session.createQuery(queryStr);
            pList = query.list();
            session.close();
            boolean flag = true;
            for (sign_up_in s : pList) {
                if (s.getEmail().equals(email.getText())) {
                    flag = false;
                    String em = email.getText();
                    try {
                        Email email = new Email("afrah.ibra.alsaadi@gmail.com", "afrah2000");
                        email.setFrom("afrah.ibra.alsaadi@gmail.com", "Physics Lab Game");
                        email.setSubject(" Rest your password");
                        email.setContent(rand, "text/html");
                        email.addRecipient(em);
                        email.send();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (flag) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("please make sure entered email is correct ");
                alert.show();

            }
        }

    }

    @FXML
    public void backToLogin(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //his line gela the Stage informal.ion
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
