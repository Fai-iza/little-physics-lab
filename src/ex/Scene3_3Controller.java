/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
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
import javafx.scene.control.Slider;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ano
 */
public class Scene3_3Controller implements Initializable {

    @FXML
    private ComboBox comb;

    @FXML
    private ImageView Lletter;

    @FXML
    private ImageView Pletter;

    @FXML
    private ImageView Rletter;

    @FXML
    private ImageView aletter;

    @FXML

    private Cylinder cylinder;

    @FXML
    private ImageView equalLine;
    
     @FXML
    private Slider length;

    @FXML
    private Slider resistivty;

    @FXML
    private Slider area;

    DropShadow shadow = new DropShadow();
    DropShadow reset_shadow = new DropShadow();

    @FXML
    public void home(ActionEvent event) throws IOException {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("mapex3.fxml"));
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
    public void start(ActionEvent event) throws IOException {

    }

    @FXML
    public void pause(ActionEvent event) throws IOException {

    }

    @FXML
    public void redo(ActionEvent event) throws IOException {

        aletter.setImage(aletter.getImage());
        aletter.setFitWidth(51);
        aletter.setFitHeight(56);
        aletter.setLayoutX(688);
        aletter.setLayoutY(240);

        Rletter.setImage(Rletter.getImage());
        Rletter.setFitWidth(46);
        Rletter.setFitHeight(56);
        Rletter.setLayoutX(627);
        Rletter.setLayoutY(369);
       
        Lletter.setImage(Lletter.getImage());
        Lletter.setFitWidth(51);
        Lletter.setFitHeight(56);
        Lletter.setLayoutX(618);
        Lletter.setLayoutY(304);
        

        Pletter.setImage(Pletter.getImage());
        Pletter.setFitWidth(57);
        Pletter.setFitHeight(56);
        Pletter.setLayoutX(604);
        Pletter.setLayoutY(240);
        
        cylinder.setRadius(20);
        cylinder.setHeight(100);
        cylinder.setLayoutX(714);
        cylinder.setLayoutY(360);

        equalLine.setImage(equalLine.getImage());
        equalLine.setFitWidth(201);
        equalLine.setFitHeight(20);
        equalLine.setLayoutX(607);
        equalLine.setLayoutY(437);
       

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);    a.setContentText("1- Choose from combobox your tool \n"
                                                                      + "2- Enter key from 1 to 6 to move tools. ");  a.show();


        shadow.setColor(Color.WHITE);
        shadow.setOffsetX(1.2);
        shadow.setOffsetY(1.2);
        shadow.setSpread(0.5);
        reset_shadow.setColor(Color.TRANSPARENT);

        comb.setStyle("-fx-font: 13px \"Comic Sans MS\";");
        comb.getItems().addAll("Lletter", "Rletter", "Pletter", "cylinder", "aletter", "equalLine");

        comb.valueProperty().addListener((options) -> {
            if (comb.getValue().equals("Rletter")) {
                Rletter.setEffect(shadow);
                aletter.setEffect(reset_shadow);
                Lletter.setEffect(reset_shadow);
                Pletter.setEffect(reset_shadow);
                equalLine.setEffect(reset_shadow);
                cylinder.setEffect(reset_shadow);
            } else if (comb.getValue().equals("Lletter")) {
                Lletter.setEffect(shadow);
                Rletter.setEffect(reset_shadow);
                aletter.setEffect(reset_shadow);
                Pletter.setEffect(reset_shadow);
                equalLine.setEffect(reset_shadow);
                cylinder.setEffect(reset_shadow);
            } else if (comb.getValue().equals("aletter")) {
                aletter.setEffect(shadow);
                Rletter.setEffect(reset_shadow);
                Lletter.setEffect(reset_shadow);
                Pletter.setEffect(reset_shadow);
                equalLine.setEffect(reset_shadow);
                cylinder.setEffect(reset_shadow);
            } else if (comb.getValue().equals("Pletter")) {
                Pletter.setEffect(shadow);
                aletter.setEffect(reset_shadow);
                Lletter.setEffect(reset_shadow);
                Rletter.setEffect(reset_shadow);
                equalLine.setEffect(reset_shadow);
                cylinder.setEffect(reset_shadow);
            } else if (comb.getValue().equals("cylinder")) {
                cylinder.setEffect(shadow);
                aletter.setEffect(reset_shadow);
                Lletter.setEffect(reset_shadow);
                Pletter.setEffect(reset_shadow);
                equalLine.setEffect(reset_shadow);
                Rletter.setEffect(reset_shadow);
            } else if (comb.getValue().equals("equalLine")) {
                equalLine.setEffect(shadow);
                aletter.setEffect(reset_shadow);
                Lletter.setEffect(reset_shadow);
                Pletter.setEffect(reset_shadow);
                Rletter.setEffect(reset_shadow);
                cylinder.setEffect(reset_shadow);
            }

        });

    }

    @FXML
    protected void handletools_comb(ActionEvent event) throws IOException {

        if (comb.getValue().equals("Rletter")) {
            Rletter.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                } else if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }
            });
            Rletter.requestFocus();
        }

        //======================================================================
        if (comb.getValue().equals("equalLine")) {
            equalLine.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                } else if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }
            });
            equalLine.requestFocus();
        }

        //======================================================================
        if (comb.getValue().equals("Pletter")) {
            Pletter.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                } else if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }
            });
            Pletter.requestFocus();
        }

        //======================================================================
        if (comb.getValue().equals("Lletter")) {
            Lletter.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                } else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }
            });
            Lletter.requestFocus();
        }

        //======================================================================
        if (comb.getValue().equals("aletter")) {
            aletter.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                }else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                } else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                }else if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }
            });
            aletter.requestFocus();
        }

        //======================================================================
        if (comb.getValue().equals("cylinder")) {
            cylinder.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.DIGIT6) {
                    if (!((aletter.getLayoutX() == 425 && aletter.getLayoutY() == 311)
                            || (Rletter.getLayoutX() == 425 && Rletter.getLayoutY() == 311)
                            || (Pletter.getLayoutX() == 425 && Pletter.getLayoutY() == 311)
                            || (equalLine.getLayoutX() == 425 && equalLine.getLayoutY() == 311)
                            || (Lletter.getLayoutX() == 425 && Lletter.getLayoutY() == 311))) {
                        cylinder.setEffect(reset_shadow);
                        cylinder.setRadius(20);
                        cylinder.setHeight(100);
                        cylinder.setLayoutX(425);
                        cylinder.setLayoutY(311);
                    } else {
                        cylinder.setLayoutX(714);
                        cylinder.setLayoutY(360);
                    }
                }else if (e.getCode() == KeyCode.DIGIT1) {
                    if (!((aletter.getLayoutX() == 114 && aletter.getLayoutY() == 287)|| (Lletter.getLayoutX() == 265 && Lletter.getLayoutY() == 235)
                            || (Pletter.getLayoutX() == 114 && Pletter.getLayoutY() == 287)
                            || (equalLine.getLayoutX() == 114 && equalLine.getLayoutY() == 287)
                            || (cylinder.getLayoutX() == 114 && cylinder.getLayoutY() == 287))) {
                        Rletter.setEffect(reset_shadow);
                        Rletter.setFitWidth(46);
                        Rletter.setFitHeight(56);
                        Rletter.setLayoutX(114);
                        Rletter.setLayoutY(287);
                    } else {
                        Rletter.setLayoutX(627);
                        Rletter.setLayoutY(369);
                    }
                }else if (e.getCode() == KeyCode.DIGIT2) {
                    if (!((aletter.getLayoutX() == 171 && aletter.getLayoutY() == 300)
                            || (Lletter.getLayoutX() == 171 && Lletter.getLayoutY() == 300)
                            || (Rletter.getLayoutX() == 171 && Rletter.getLayoutY() == 300)
                            || (Pletter.getLayoutX() == 171 && Pletter.getLayoutY() == 300)
                            || (cylinder.getLayoutX() == 171 && cylinder.getLayoutY() == 300))) {
                        equalLine.setEffect(reset_shadow);
                        equalLine.setFitWidth(201);
                        equalLine.setFitHeight(20);
                        equalLine.setLayoutX(171);
                        equalLine.setLayoutY(300);
                    } else {
                        equalLine.setLayoutX(607);
                        equalLine.setLayoutY(437);
                    }

                } else if (e.getCode() == KeyCode.DIGIT3) {
                    if (!((aletter.getLayoutX() == 198 && aletter.getLayoutY() == 233)
                            || (Lletter.getLayoutX() == 198 && Lletter.getLayoutY() == 233)
                            || (Rletter.getLayoutX() == 198 && Rletter.getLayoutY() == 233)
                            || (equalLine.getLayoutX() == 198 && equalLine.getLayoutY() == 233)
                            || (cylinder.getLayoutX() == 198 && cylinder.getLayoutY() == 233))) {
                        Pletter.setEffect(reset_shadow);
                        Pletter.setFitWidth(57);
                        Pletter.setFitHeight(56);
                        Pletter.setLayoutX(198);
                        Pletter.setLayoutY(233);
                    } else {
                        Pletter.setLayoutX(604);
                        Pletter.setLayoutY(240);
                    }

                } else if (e.getCode() == KeyCode.DIGIT4) {
                    if (!((aletter.getLayoutX() == 274 && aletter.getLayoutY() == 240)
                            || (Rletter.getLayoutX() == 274 && Rletter.getLayoutY() == 240)
                            || (Pletter.getLayoutX() == 274 && Pletter.getLayoutY() == 240)
                            || (equalLine.getLayoutX() == 274 && equalLine.getLayoutY() == 240)
                            || (cylinder.getLayoutX() == 274 && cylinder.getLayoutY() == 240))) {
                        Lletter.setEffect(reset_shadow);
                        Lletter.setFitWidth(51);
                        Lletter.setFitHeight(56);
                        Lletter.setLayoutX(274);
                        Lletter.setLayoutY(240);
                    } else {
                        Lletter.setLayoutX(618);
                        Lletter.setLayoutY(304);
                    }
                } else if (e.getCode() == KeyCode.DIGIT5) {
                    if (!((Pletter.getLayoutX() == 240 && Pletter.getLayoutY() == 332)
                            || (Lletter.getLayoutX() == 240 && Lletter.getLayoutY() == 332)
                            || (Rletter.getLayoutX() == 240 && Rletter.getLayoutY() == 332)
                            || (equalLine.getLayoutX() == 240 && equalLine.getLayoutY() == 332)
                            || (cylinder.getLayoutX() == 240 && cylinder.getLayoutY() == 332))) {
                        aletter.setEffect(reset_shadow);
                        aletter.setFitWidth(51);
                        aletter.setFitHeight(56);
                        aletter.setLayoutX(240);
                        aletter.setLayoutY(332);
                    } else {
                        aletter.setLayoutX(688);
                        aletter.setLayoutY(240);
                    }

                }
            });
            
            cylinder.requestFocus();
        }
        
                
        
        length.setMax(100);
        length.setMin(0);
        
        length.setValue(50);
        area.setValue(50);
        resistivty.setValue(50);
        
        length.valueProperty().addListener((Observable ov) -> {
            cylinder.setHeight((length.getValue() * 2.0) + cylinder.getHeight() / cylinder.getHeight());
            
            Lletter.setFitHeight( (Lletter.getFitHeight() *length.getValue()) + Lletter.getFitHeight() );
            Rletter.setFitHeight((length.getValue()* 2)  + (Rletter.getFitHeight()*5 ) / length.getValue()+3 );
           
        });

        
        area.valueProperty().addListener(ov -> {
            cylinder.setRadius(area.getValue() + cylinder.getRadius() / cylinder.getRadius());
            Rletter.setFitHeight(((area.getValue()* 1.50)  + Rletter.getFitHeight() / Rletter.getFitHeight()) );
            aletter.setFitHeight((area.getValue()* 1.50)  + aletter.getFitHeight() / aletter.getFitHeight() );

        });
        
        resistivty.valueProperty().addListener(ov -> {
            Pletter.setFitHeight((resistivty.getValue()* 1.50)  + Pletter.getFitHeight()  / Pletter.getFitHeight());
            Rletter.setFitHeight((resistivty.getValue()* 1.50)  + Rletter.getFitHeight()  / Rletter.getFitHeight());
        });
        
        
    

    }
    
}
