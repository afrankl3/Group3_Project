/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenuGUEST extends Application {

    protected AnchorPane anchorPane;
    protected Button button;
    protected Button button0;
    protected ImageView imageView;
    protected Button button1;
    static Stage stageG = new Stage();
    
    @Override
    public void start(Stage stageG) {
        SignInBase ctc = new SignInBase();
        RoomPickerBase ctc3 = new RoomPickerBase();
        REALSignIn ctc4 = new REALSignIn();
        anchorPane = new AnchorPane();
        button = new Button();
        button0 = new Button();
        imageView = new ImageView();
        button1 = new Button();

        //setPrefHeight(400.0);
        //setPrefWidth(640.0);

        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(582.0);

        button.setLayoutX(14.0);
        button.setLayoutY(14.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(78.0);
        button.setText("Sign Up");
        button.setOnAction((ActionEvent e) -> {
        ctc.start(SignInBase.stage1);
        stageG.close();  
        
        });
        button0.setLayoutX(100.0);
        button0.setLayoutY(14.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(78.0);
        button0.setText("Sign In");
           button0.setOnAction((ActionEvent e) -> {
        ctc4.start(REALSignIn.stage4);
        stageG.close();  
        
        });
        imageView.setFitHeight(97.0);
        imageView.setFitWidth(112.0);
        imageView.setLayoutX(528.0);
        //imageView.setImage(new Image(getClass().getResource("University-of-mary-washington-logo.jpg").toExternalForm()));

        button1.setLayoutX(195.0);
        button1.setLayoutY(14.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(173.0);
        button1.setText("View All Reservations");

        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(button1);
        //getChildren().add(anchorPane);

        Scene scene = new Scene(anchorPane, 450, 640);
        stageG.setTitle("Main menu");
        stageG.setScene(scene);
        stageG.show();
    }
}
