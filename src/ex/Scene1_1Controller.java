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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ano
 */
public class Scene1_1Controller implements Initializable {
    
          @FXML
 private MediaView media;
        MediaPlayer mediaPlayer1;
//private static final String MEDIA_URL="s.mp4";
private MediaPlayer mediaPlayer;
private  String URL="7edit.wav";
private Boolean flag=true;
      
    @FXML
    public void goBack(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("Scene1_4.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
 
    }
    
    
       @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex1.fxml"));
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
         System.out.println(this.getClass().getResource(URL).toExternalForm());
           mediaPlayer=new MediaPlayer(new Media(this.getClass().getResource(URL).toExternalForm())); 
    }    
    
    
       @FXML
    public void sound(ActionEvent event) throws IOException{
       // mediaPlayer1.play();
        if(flag){
        mediaPlayer.play();
        flag=false;}
        else{
        mediaPlayer.pause();
        flag=true;
//
        }
    }
    
}
