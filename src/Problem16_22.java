/*
Camila Arbaiza

Take home test

Problem 16.22

Professor: Tanes Kanchanawanchai


 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;



public class Problem16_22 extends Application {

    private static final String A =  "https://www.marxists.org/history/ussr/sounds/mp3/anthems/Armenia.mp3";


    @Override
    public void start(Stage primaryStage) throws Exception {


        AudioClip audio = new AudioClip(A);


        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");
        Button loopButton = new Button("Loop");



        playButton.setOnAction(e -> {
            audio.play();
        });

        stopButton.setOnAction(e -> {
            audio.stop();
        });

        loopButton.setOnAction(e -> {
            audio.setCycleCount(AudioClip.INDEFINITE);
        });


        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playButton, stopButton, loopButton);



        BorderPane pane = new BorderPane();

        pane.setBottom(hBox);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Audio"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

    }
}//end Problem16_22
