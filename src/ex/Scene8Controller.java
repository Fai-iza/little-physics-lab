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
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ano
 */
public class Scene8Controller implements Initializable {
    
    
          @FXML
    public void home(ActionEvent event) throws IOException{
        
    Parent tableViewParent =  FXMLLoader.load (getClass().getResource("mapex1.fxml"));
       Scene tableViewScene  = new Scene(tableViewParent); 
    //his line gela the Stage informal.ion
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (tableViewScene);
    window.show() ;
 
    }
    
  @FXML
    private Label label;
    
  @FXML
 private MediaView media;
//private static final String MEDIA_URL="s.mp4";
private MediaPlayer mediaPlayer;
private  String URL="p.mp4";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO   System.out.println(url.toString());
           System.out.println(this.getClass().getResource(URL).toExternalForm());
           mediaPlayer=new MediaPlayer(new Media(this.getClass().getResource(URL).toExternalForm())); 
     //  mediaPlayer.setAutoPlay(true);
       media.setMediaPlayer(mediaPlayer);
    }
    
         @FXML
    public void play(ActionEvent event) throws IOException{
        mediaPlayer.play();
  
 
    }
    
    
       @FXML
    public void pause(ActionEvent event) throws IOException{
        mediaPlayer.pause();
  
 
    }
    
    
       @FXML
    public void replay(ActionEvent event) throws IOException{
        mediaPlayer.seek(mediaPlayer.getStartTime());
        mediaPlayer.play();
  
 
    }


    
    
}
