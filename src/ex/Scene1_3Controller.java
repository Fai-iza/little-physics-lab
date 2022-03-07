/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ano
 */
public class Scene1_3Controller implements Initializable {

    @FXML
    private ImageView ball;

    @FXML
    private ComboBox comb;

    @FXML
    private ImageView string;

    @FXML
    private ImageView wirestring;

  
     Timeline time = new Timeline();
    
    final  Image p1 = new Image(Scene1_3Controller.class.getResource("pu1.png").toString());
    final  Image p2 = new Image(Scene1_3Controller.class.getResource("pu2.png").toString());
    final  Image p3 = new Image(Scene1_3Controller.class.getResource("pu3.png").toString());
    final  Image p4 = new Image(Scene1_3Controller.class.getResource("pu4.png").toString());
    final  Image p5 = new Image(Scene1_3Controller.class.getResource("pu5.png").toString());
    final  Image p6 = new Image(Scene1_3Controller.class.getResource("pu6.png").toString());
    final  Image p7 = new Image(Scene1_3Controller.class.getResource("pu7.png").toString());
    
    
    @FXML
    ImageView pu1 = new ImageView(p1);
    @FXML
    ImageView pu2 = new ImageView(p2);
    @FXML
    ImageView pu3 = new ImageView(p3);
    @FXML
    ImageView pu4 = new ImageView(p4);
    @FXML
    ImageView pu5 = new ImageView(p5);
    @FXML
    ImageView pu6 = new ImageView(p6);
    @FXML
    ImageView pu7 = new ImageView(p7);
    
     private Group pund;
     
        @FXML
    private Pane pane;
        
    
    
    @FXML
    public void home(ActionEvent event) throws IOException {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("mapex1.fxml"));
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
        
        ball.setVisible(false);
        string.setVisible(false);
        wirestring.setVisible(false);
   
      
      
        pu1.setFitHeight(200);
        pu1.setFitWidth(200);
       
        pu2.setFitHeight(200);
        pu2.setFitWidth(200);
     
        pu3.setFitHeight(200);
        pu3.setFitWidth(200);
        
       
        pu4.setFitHeight(200);
        pu4.setFitWidth(200);
        
       
        pu5.setFitHeight(200);
        pu5.setFitWidth(200);
        
        
        pu6.setFitHeight(200);
        pu6.setFitWidth(200);
        
        
        pu7.setFitHeight(200);
        pu7.setFitWidth(200);
  
        pund = new Group(pu1);

        pund.setTranslateX(50);
        pund.setTranslateY(50);
        
        pane.getChildren().add(pund);
  
        
      
        time.setCycleCount(Timeline.INDEFINITE);
  
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(500), (ActionEvent event) -> {
            pund.getChildren().setAll(pu2);
        }
        ));
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(600), (ActionEvent event) -> {
            pund.getChildren().setAll(pu3);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(700), (ActionEvent event) -> {
            pund.getChildren().setAll(pu4);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(800), (ActionEvent event) -> {
            pund.getChildren().setAll(pu5);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(900), (ActionEvent event) -> {
            pund.getChildren().setAll(pu6);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1000), (ActionEvent event) -> {
            pund.getChildren().setAll(pu7);
        }
        ));
        
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1100), (ActionEvent event) -> {
            pund.getChildren().setAll(pu6);
        }
        ));
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1200), (ActionEvent event) -> {
            pund.getChildren().setAll(pu5);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1300), (ActionEvent event) -> {
            pund.getChildren().setAll(pu4);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1400), (ActionEvent event) -> {
            pund.getChildren().setAll(pu3);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1500), (ActionEvent event) -> {
            pund.getChildren().setAll(pu2);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1600), (ActionEvent event) -> {
            pund.getChildren().setAll(pu1);
        }
        ));
        
        
        
        time.setCycleCount(Timeline.INDEFINITE);
  
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(500), (ActionEvent event) -> {
            pund.getChildren().setAll(pu2);
        }
        ));
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(600), (ActionEvent event) -> {
            pund.getChildren().setAll(pu3);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(700), (ActionEvent event) -> {
            pund.getChildren().setAll(pu4);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(800), (ActionEvent event) -> {
            pund.getChildren().setAll(pu5);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(900), (ActionEvent event) -> {
            pund.getChildren().setAll(pu6);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1000), (ActionEvent event) -> {
            pund.getChildren().setAll(pu7);
        }
        ));
        
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1100), (ActionEvent event) -> {
            pund.getChildren().setAll(pu6);
        }
        ));
        
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1200), (ActionEvent event) -> {
            pund.getChildren().setAll(pu5);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1300), (ActionEvent event) -> {
            pund.getChildren().setAll(pu4);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1400), (ActionEvent event) -> {
            pund.getChildren().setAll(pu3);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1500), (ActionEvent event) -> {
            pund.getChildren().setAll(pu2);
        }
        ));
        
        time.getKeyFrames().add(new KeyFrame(
        Duration.millis(1600), (ActionEvent event) -> {
            pund.getChildren().setAll(pu1);
        }
        ));
    
         
        time.play();
        
    }

    @FXML
    public void pause(ActionEvent event1) throws IOException {
        
        time.pause();
        
        
    }

    @FXML
    public void redo(ActionEvent event) throws IOException {

        time.pause();
        pund.setVisible(false);
        string.getImage();
        wirestring.getImage();
        ball.setImage(ball.getImage());
        string.setImage(string.getImage());
        wirestring.setImage(wirestring.getImage());
        ball.setVisible(true);
        string.setVisible(true);
        wirestring.setVisible(true);
        wirestring.setLayoutX(656);
        wirestring.setLayoutY(454);
        ball.setLayoutX(713);
        ball.setLayoutY(204);
        string.setLayoutX(707);
        string.setLayoutY(265);
        
    }

    DropShadow shadow = new DropShadow();
    DropShadow reset_shadow = new DropShadow();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
        Alert a = new Alert(Alert.AlertType.INFORMATION);    a.setContentText("1- Choose from combobox your tool \n"
                                                                      + "2- Enter key number from 1 to 3 to move tools ");  a.show();
        shadow.setColor(Color.WHITE);
        shadow.setOffsetX(1.2);
        shadow.setOffsetY(1.2);
        shadow.setSpread(0.5);
        reset_shadow.setColor(Color.TRANSPARENT);

        comb.setStyle("-fx-font: 13px \"Comic Sans MS\";");
        comb.getItems().addAll("ball", "string", "wirestring");

        comb.valueProperty().addListener((options) -> {
            if (comb.getValue().equals("ball")) {
                ball.setEffect(shadow);
                string.setEffect(reset_shadow);
                wirestring.setEffect(reset_shadow);
            } else if (comb.getValue().equals("string")) {
                string.setEffect(shadow);
                ball.setEffect(reset_shadow);
                wirestring.setEffect(reset_shadow);
            } else if (comb.getValue().equals("wirestring")) {
                wirestring.setEffect(shadow);
                string.setEffect(reset_shadow);
                ball.setEffect(reset_shadow);
            }
        });
        

    
        
    }

    @FXML
    protected void handleplanets_comb(ActionEvent event) throws IOException {

        
        
          if (comb.getValue().equals("ball")) {
            ball.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((ball.getLayoutX() == 195 && ball.getLayoutY() == 217) || (string.getLayoutX() == 195 && string.getLayoutY() == 217))) {

                        wirestring.setEffect(reset_shadow);
                        wirestring.setFitWidth(192);
                        wirestring.setFitHeight(24);
                        wirestring.setLayoutX(195);
                        wirestring.setLayoutY(217);
                    } else {
                        wirestring.setLayoutX(656);
                        wirestring.setLayoutY(454);
                    }

                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((string.getLayoutX() == 272 && string.getLayoutY() == 398) || (wirestring.getLayoutX() == 272 && wirestring.getLayoutY() == 398))) {
                        ball.setEffect(reset_shadow);
                        ball.setFitWidth(39);
                        ball.setFitHeight(91);
                        ball.setLayoutX(272);
                        ball.setLayoutY(398);
                    } else {
                        ball.setLayoutX(713);
                        ball.setLayoutY(204);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {

                    if (!((ball.getLayoutX() == 265 && ball.getLayoutY() == 235) || (wirestring.getLayoutX() == 265 && wirestring.getLayoutY() == 235))) {
                        string.setEffect(reset_shadow);
                        string.setFitWidth(51);
                        string.setFitHeight(177);
                        string.setLayoutX(265);
                        string.setLayoutY(235);
                    } else {
                        string.setLayoutX(707);
                        string.setLayoutY(265);
                    }
                }

            });
            
            wirestring.requestFocus();
        }

        
        
        if (comb.getValue().equals("string")) {
            string.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((ball.getLayoutX() == 265 && ball.getLayoutY() == 235) || (wirestring.getLayoutX() == 265 && wirestring.getLayoutY() == 235))) {
                        string.setEffect(reset_shadow);
                        string.setFitWidth(51);
                        string.setFitHeight(177);
                        string.setLayoutX(265);
                        string.setLayoutY(235);
                    } else {
                        string.setLayoutX(707);
                        string.setLayoutY(265);
                    }
                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((string.getLayoutX() == 272 && string.getLayoutY() == 398) || (wirestring.getLayoutX() == 272 && wirestring.getLayoutY() == 398))) {
                        ball.setEffect(reset_shadow);
                        ball.setFitWidth(39);
                        ball.setFitHeight(91);
                        ball.setLayoutX(272);
                        ball.setLayoutY(398);
                    } else {
                        ball.setLayoutX(713);
                        ball.setLayoutY(204);
                    }
                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((ball.getLayoutX() == 195 && ball.getLayoutY() == 217) || (string.getLayoutX() == 195 && string.getLayoutY() == 217))) {

                        wirestring.setEffect(reset_shadow);
                        wirestring.setFitWidth(192);
                        wirestring.setFitHeight(24);
                        wirestring.setLayoutX(195);
                        wirestring.setLayoutY(217);
                    } else {
                        wirestring.setLayoutX(656);
                        wirestring.setLayoutY(454);
                    }

                }

            });
              string.requestFocus();
        }
        
        
        if (comb.getValue().equals("wirestring")) {
            ball.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((string.getLayoutX() == 272 && string.getLayoutY() == 398) || (wirestring.getLayoutX() == 272 && wirestring.getLayoutY() == 398))) {
                        ball.setEffect(reset_shadow);
                        ball.setFitWidth(39);
                        ball.setFitHeight(91);
                        ball.setLayoutX(272);
                        ball.setLayoutY(398);
                    } else {
                        ball.setLayoutX(713);
                        ball.setLayoutY(204);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {

                    if (!((ball.getLayoutX() == 265 && ball.getLayoutY() == 235) || (wirestring.getLayoutX() == 265 && wirestring.getLayoutY() == 235))) {
                        string.setEffect(reset_shadow);
                        string.setFitWidth(51);
                        string.setFitHeight(177);
                        string.setLayoutX(265);
                        string.setLayoutY(235);
                    } else {
                        string.setLayoutX(707);
                        string.setLayoutY(265);
                    }
                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((ball.getLayoutX() == 195 && ball.getLayoutY() == 217) || (string.getLayoutX() == 195 && string.getLayoutY() == 217))) {

                        wirestring.setEffect(reset_shadow);
                        wirestring.setFitWidth(192);
                        wirestring.setFitHeight(24);
                        wirestring.setLayoutX(195);
                        wirestring.setLayoutY(217);
                    } else {
                        wirestring.setLayoutX(656);
                        wirestring.setLayoutY(454);
                    }

                }

            });
              ball.requestFocus();
        }


  
        
         }
    
    
   

}
