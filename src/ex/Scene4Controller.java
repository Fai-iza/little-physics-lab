/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
/**
 * FXML Controller class
 *
 * @author ano
 */
 

public class Scene4Controller implements Initializable {
@FXML
 private MediaView mediaView;
private  String MEDIA_URL="p.mp4";


    /**
     * Initializes the controller class.
     */
private MediaPlayer mediaPlayer;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // String VUrl="Pendulum.mp4";
         System.out.println(url.toString());
           System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());
           mediaPlayer=new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm())); 
       mediaPlayer.setAutoPlay(true);
       mediaView.setMediaPlayer(mediaPlayer);
// TODO
       // file=new File("Simple Pendulum _ Science Experiment.mp4");
        
     
    }    

    public MediaView getMediaView() {
        return mediaView;
    }

    public void setMediaView(MediaView mediaView) {
        this.mediaView = mediaView;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
   
}
