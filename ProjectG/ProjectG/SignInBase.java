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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static com.User.userList;
import static com.Admin.adminList;
import static com.Room.roomList;
import javafx.geometry.Pos;
import javafx.stage.Modality;

public class SignInBase extends Application {
    public static boolean isAdmin;
    Stage popupwindow=new Stage();
    protected AnchorPane anchorPane;
    protected AnchorPane popupPane;
    protected Label label;
    protected PasswordField passwordField;
    protected TextField textField;
    protected TextField textField0;
    protected TextField textField1;
    protected Label confirmText;
    protected Button button;
    protected Button button0;
    protected Button confirmButton;
    static Stage stage1 = new Stage();
    @Override
    public void start(Stage stage1) {
        
        MainMenuADMIN ctcA =new MainMenuADMIN();
        MainMenuUSER ctcU =new MainMenuUSER();
        MainMenuGUEST ctcG =new MainMenuGUEST();
        anchorPane = new AnchorPane();
        popupPane = new AnchorPane();
        label = new Label();
        passwordField = new PasswordField();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        button = new Button();
        button0 = new Button();
        confirmText = new Label();
       confirmButton = new Button();

        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(155.0);
        label.setLayoutY(177.0);
        label.setStyle("");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#9f9f9f"));
        label.setWrapText(false);
        label.setFont(new Font(18.0));

        passwordField.setLayoutX(220.0);
        passwordField.setLayoutY(189.0);
        passwordField.setPrefHeight(31.0);
        passwordField.setPrefWidth(273.0);
      
        textField.setEditable(false);
        textField.setLayoutX(33.0);
        textField.setLayoutY(189.0);
        textField.setText("                 Password:");

        textField0.setEditable(false);
        textField0.setLayoutX(33.0);
        textField0.setLayoutY(146.0);
        textField0.setText("                UMW Email:");

        textField1.setLayoutX(220.0);
        textField1.setLayoutY(146.0);
        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(273.0);

        button.setLayoutX(285.0);
        button.setLayoutY(242.0);
        button.setMnemonicParsing(false);
        button.setText("Sign up");
        button.setOnAction((ActionEvent e) -> {
            String username = textField1.getText();
            String password = passwordField.getText();
        System.out.println(password);
            if (username.contains("mail.umw.edu")){
        User newUser =new User(username,password);
        userList.add(newUser);
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Sign Up");
        VBox layout= new VBox(10);
        layout.setAlignment(Pos.CENTER);
     
        confirmText.setText("User Created!");
        confirmButton.setText("Menu");
        popupPane.getChildren().add(confirmText);
        popupPane.getChildren().add(confirmButton);
        Scene scene1= new Scene(popupPane, 300, 300);  
        confirmText.setLayoutX(100.0);
        confirmText.setLayoutY(100.0);
        confirmButton.setLayoutX(100);
        confirmButton.setLayoutY(200);
        confirmButton.setOnAction((ActionEvent f) -> {
            ctcG.start(MainMenuGUEST.stageG);
            popupwindow.close();
            stage1.close();
        });
        popupwindow.setScene(scene1);   
        popupwindow.show(); 
        isAdmin=false;
        System.out.println("Users:"+userList.size());
    }
        else if(username.contains("umw.edu")){
        Admin newAdmin = new Admin(username,password);
        System.out.println("Adding a new user: " + username + " " + password);
        adminList.add(newAdmin);
        System.out.println(("adminList = " + (adminList.get(0)).getName()) + " " + (adminList.get(0)).getPassword()); 
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Sign Up");
        VBox layout= new VBox(10);
        layout.setAlignment(Pos.CENTER);
     
        confirmText.setText("Admin Created!");
        confirmButton.setText("Menu");
        popupPane.getChildren().add(confirmText);
        popupPane.getChildren().add(confirmButton);
        Scene scene1= new Scene(popupPane, 300, 300);  
        confirmText.setLayoutX(100.0);
        confirmText.setLayoutY(100.0);
        confirmButton.setLayoutX(100);
        confirmButton.setLayoutY(200);
        confirmButton.setOnAction((ActionEvent f) -> {
            ctcG.start(MainMenuGUEST.stageG);
            popupwindow.close();
            stage1.close();
        });
        popupwindow.setScene(scene1);   
        popupwindow.show(); 
        isAdmin=true;
    }
            
  
        
         });
        button0.setLayoutX(33.0);
        button0.setLayoutY(14.0);
        button0.setMnemonicParsing(false);
        button0.setText("Back to Menu");
        button0.setOnAction((ActionEvent e) -> {
        ctcG.start(MainMenuGUEST.stageG);
        stage1.close(); 
        
        });
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(passwordField);
        anchorPane.getChildren().add(textField);
        anchorPane.getChildren().add(textField0);
        anchorPane.getChildren().add(textField1);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        //getChildren().add(anchorPane);
        
        Scene scene = new Scene(anchorPane, 550, 600);
        stage1.setTitle("Sign Up");
        stage1.setScene(scene);
        stage1.show();
    }
}
