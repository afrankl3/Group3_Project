/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.VariousMethods.roomList;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
/**
 *
 * @author Anna
 */
public class AccountBase extends VBox {

    protected final AnchorPane anchorPane;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final ImageView imageView;
    Stage popupwindow=new Stage();
    public AccountBase () {

        anchorPane = new AnchorPane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        imageView = new ImageView();

        setPrefHeight(400.0);
        setPrefWidth(640.0);

        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        button.setLayoutX(14.0);
        button.setLayoutY(14.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(156.0);
        button.setText("Back to menu");

        button0.setLayoutX(92.0);
        button0.setLayoutY(185.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(198.0);
        button0.setText("Change Password");

        button1.setLayoutX(92.0);
        button1.setLayoutY(259.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(198.0);
        button1.setText("Delete Account");

        button2.setLayoutX(92.0);
        button2.setLayoutY(122.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(198.0);
        button2.setText("View Reservations");
        button2.setOnAction((ActionEvent e) -> {
   
        });

        button3.setLayoutX(367.0);
        button3.setLayoutY(122.0);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(198.0);
        button3.setText("View All Reservations");
        button3.setOnAction((ActionEvent e) -> {
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("All Reservations");
        VBox layout= new VBox(10);
            for (int i=0; i<roomList.size(); i++){
                Button subbutton3 = new Button("Close");
                Label label1= new Label("Room Name: "+roomList.get(i).getRName()+"Building: "+roomList.get(i).getBuilding()+"Seats: "+roomList.get(i).getSeats()+"Equiptment?: "+roomList.get(i).getEquip()+","+roomList.get(i).getAvailability());
                layout.getChildren().addAll(label1, subbutton3);     
                layout.setAlignment(Pos.CENTER);     
                Scene scene1= new Scene(layout, 300, 250);  
                popupwindow.setScene(scene1);   
                popupwindow.showAndWait();
        } 
        });
        
        
        button4.setLayoutX(367.0);
        button4.setLayoutY(259.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(31.0);
        button4.setPrefWidth(198.0);
        button4.setText("Delete User Account");
        button4.setOnAction((ActionEvent e) -> {
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        VBox layout= new VBox(10);
        
        });
        
        
        button5.setLayoutX(367.0);
        button5.setLayoutY(185.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(31.0);
        button5.setPrefWidth(198.0);
        button5.setText("Delete Reservations");

        imageView.setFitHeight(107.0);
        imageView.setFitWidth(112.0);
        imageView.setLayoutX(521.0);
        imageView.setLayoutY(5.0);
        imageView.setImage(new Image(getClass().getResource("University-of-mary-washington-logo.jpg").toExternalForm()));

        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);
        anchorPane.getChildren().add(button4);
        anchorPane.getChildren().add(button5);
        anchorPane.getChildren().add(imageView);
        getChildren().add(anchorPane);

    

                }
}