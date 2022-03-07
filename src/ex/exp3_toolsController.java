/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.IOException;
import javafx.scene.image.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author vip
 */
public class exp3_toolsController implements Initializable {

    @FXML
    Image man1 = new Image(exp3_toolsController.class.getResource("man1.png").toString());
    @FXML
    Image man2 = new Image(exp3_toolsController.class.getResource("man2.png").toString());

    Timeline time = new Timeline();
    TranslateTransition tr = new TranslateTransition();

    @FXML
    private ImageView Box;

    @FXML
    private ImageView Mans;

    @FXML
    private ComboBox combb;

    @FXML
    private Pane pane;

    private Group man;

    @FXML
    ImageView m1 = new ImageView(man1);
    @FXML
    ImageView m2 = new ImageView(man2);

    DropShadow shadow = new DropShadow();
    DropShadow reset_shadow = new DropShadow();

    
    public static double points2;
    
    @FXML
    public void home(ActionEvent event) throws IOException {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("mapex2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //his line gela the Stage informal.ion
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }

    @FXML
    public void sound(ActionEvent event) throws IOException {

    }

    @FXML
    public void next(ActionEvent event) throws IOException {

    }

    @FXML
    public void prev(ActionEvent event) throws IOException {

    }

    @FXML
    public void start(ActionEvent event1) throws IOException {

        Mans.setVisible(false);
        Box.setVisible(false);

        m1.setFitHeight(300);
        m1.setFitWidth(300);
        m2.setFitHeight(300);
        m2.setFitWidth(300);

        man = new Group(m1);

        man.setTranslateX(150);
        man.setTranslateY(-30);

        pane.getChildren().add(man);

        time.setCycleCount(Timeline.INDEFINITE);

        time.getKeyFrames().add(new KeyFrame(
                Duration.millis(2000), (ActionEvent event) -> {
            man.getChildren().setAll(m2);
        }
        ));

        tr.setNode(man);
        tr.setByX(-300);
        tr.setDuration(Duration.millis(9000));
        tr.setCycleCount(4);
        tr.setAutoReverse(false);

        time.play();
        tr.play();

    }

    @FXML
    public void pause(ActionEvent event) throws IOException {

        time.pause();
        tr.pause();

        
    }

    @FXML
    public void redo(ActionEvent event) throws IOException {
 
        time.pause();
        tr.pause();
        man.setVisible(false);
        Mans.getImage();
        Box.getImage();
        Mans.setImage(Mans.getImage());
        Box.setImage(Box.getImage());
        Box.setVisible(true);
        Mans.setVisible(true);
        Mans.setLayoutX(674);
        Mans.setLayoutY(209);
        Box.setLayoutX(698);
        Box.setLayoutY(377);
        
    }

    /**
     * Initializes the controller class.
     * @throws java.io.IOException
     */
    
   
    @Override
public void initialize(URL url, ResourceBundle rb) {

    
    
        Alert a = new Alert(Alert.AlertType.INFORMATION);    a.setContentText("1- Choose from combobox your tool \n"
                                                                      + "2- Enter key 1 Or 2 to move tools. ");  a.show();

    
        shadow.setColor(Color.WHITE);
        shadow.setOffsetX(1.2);
        shadow.setOffsetY(1.2);
        shadow.setSpread(0.5);
        reset_shadow.setColor(Color.TRANSPARENT);

        combb.setStyle("-fx-font: 13px \"Comic Sans MS\";");
        combb.getItems().addAll("Mans", "Box");

        combb.valueProperty().addListener((options) -> {
            if (combb.getValue().equals("Mans")) {
                Mans.setEffect(shadow);
                Box.setEffect(reset_shadow);
            } else if (combb.getValue().equals("Box")) {
                Box.setEffect(shadow);
                Mans.setEffect(reset_shadow);
            }
        });

    }

    @FXML
    public void handletools_combb(ActionEvent event) throws IOException{

        if (combb.getValue().equals("Mans")) {
            Mans.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((Box.getLayoutX() == 267 && Box.getLayoutY() == 233))) {
                        Mans.setEffect(reset_shadow);
                        Mans.setFitWidth(108);
                        Mans.setFitHeight(180);
                        Mans.setLayoutX(267);
                        Mans.setLayoutY(233);
                    } else {
                        Mans.setLayoutX(674);
                        Mans.setLayoutY(209);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!(Mans.getLayoutX() == 195 && Mans.getLayoutY() == 398)) {

                        Box.setEffect(reset_shadow);
                        Box.setFitWidth(76);
                        Box.setFitHeight(63);
                        Box.setLayoutX(257);
                        Box.setLayoutY(285);
                    } else {
                        Box.setLayoutX(698);
                        Box.setLayoutY(377);
                    }

                }

            });
            Mans.requestFocus();
        }

        if (combb.getValue().equals("Box")) {
            Mans.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((Mans.getLayoutX() == 257 && Mans.getLayoutY() == 285))) {
                        Box.setEffect(reset_shadow);
                        Box.setFitWidth(76);
                        Box.setFitHeight(63);
                        Box.setLayoutX(257);
                        Box.setLayoutY(285);
                    } else {
                        Box.setLayoutX(698);
                        Box.setLayoutY(377);
                    }
                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!(Box.getLayoutX() == 267 && Box.getLayoutY() == 233)) {

                        Mans.setEffect(reset_shadow);
                        Mans.setFitWidth(108);
                        Mans.setFitHeight(180);
                        Mans.setLayoutX(267);
                        Mans.setLayoutY(233);
                    } else {
                        Mans.setLayoutX(674);
                        Mans.setLayoutY(209);
                    }

                }

            });
            Box.requestFocus();
        }

    }

}
