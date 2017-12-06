/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.User.userList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainMenuADMIN extends Application {

    protected AnchorPane anchorPane;
    Stage popupwindow=new Stage();
    protected Button button;
    protected Button button0;
    protected ImageView imageView;
    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected TextField confirmText;
    protected Button confirmButton;
    protected AnchorPane popupPane;
    static Stage stageA = new Stage();
    
    @Override
    public void start(Stage stageA) {
        SignInBase ctc = new SignInBase();
        RoomPickerBase ctc3 = new RoomPickerBase();
        REALSignIn ctc4 = new REALSignIn();
        MainMenuUSER ctcU = new MainMenuUSER();
        confirmText = new TextField();
        confirmButton = new Button();
        anchorPane = new AnchorPane();
        popupPane = new AnchorPane();
        button = new Button();
        button0 = new Button();
        imageView = new ImageView();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();

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
        stageA.close();  
        
        });
        button0.setLayoutX(100.0);
        button0.setLayoutY(14.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(78.0);
        button0.setText("Sign In");
           button0.setOnAction((ActionEvent e) -> {
        ctc4.start(REALSignIn.stage4);
        stageA.close();  
        
        });
        imageView.setFitHeight(97.0);
        imageView.setFitWidth(112.0);
        imageView.setLayoutX(528.0);
       // imageView.setImage(new Image(getClass().getResource("University-of-mary-washington-logo.jpg").toExternalForm()));

        button1.setLayoutX(195.0);
        button1.setLayoutY(14.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(173.0);
        button1.setText("View All Reservations");

        button2.setLayoutX(26.0);
        button2.setLayoutY(122.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(185.0);
        button2.setText("Register a Room");
           button2.setOnAction((ActionEvent e) -> {
        ctc3.start(RoomPickerBase.stage3);
        stageA.close();  
        
        });
        button3.setLayoutX(272.0);
        button3.setLayoutY(122.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(192.0);
        button3.setText("View Your Reservations");

        button4.setLayoutX(26.0);
        button4.setLayoutY(213.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(31.0);
        button4.setPrefWidth(185.0);
        button4.setText("Delete User Account");
        button4.setOnAction((ActionEvent e) -> {
         for (int i=0; i<userList.size(); i++){
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Delete Account");
        VBox layout= new VBox(10);
        layout.setAlignment(Pos.CENTER);
        confirmText.setEditable(true);
        confirmText.setText("Enter the user to remove");
        String getUser = confirmText.getText();
        
        confirmButton.setText("Menu");
        popupPane.getChildren().add(confirmText);
        popupPane.getChildren().add(confirmButton);
        Scene scene1= new Scene(popupPane, 300, 300);  
        confirmText.setLayoutX(100.0);
        confirmText.setLayoutY(100.0);
        confirmButton.setLayoutX(100);
        confirmButton.setLayoutY(200);
        confirmButton.setOnAction((ActionEvent f) -> {
           // if (getUser.equals(userList.get(i).getName())){
            //    userList.remove(i);
           // }
            System.out.println(userList.size());
            
            ctcU.start(MainMenuUSER.stageU);
            popupwindow.close();
            stageA.close();
        }); 
        popupwindow.setScene(scene1);   
        popupwindow.show();
         }
        });
        button5.setLayoutX(272.0);
        button5.setLayoutY(213.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(31.0);
        button5.setPrefWidth(192.0);
        button5.setText("Delete Reservations");

        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);
        anchorPane.getChildren().add(button4);
        anchorPane.getChildren().add(button5);
       
       Scene scene = new Scene(anchorPane, 450, 640);
        stageA.setTitle("Main menu");
        stageA.setScene(scene);
        stageA.show();
    }
}
