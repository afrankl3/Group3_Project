/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.*;
import javafx.collections.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import static com.Room.roomList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RoomPickerBase extends Application {
    protected AnchorPane anchorPane;
static Stage stage3 = new Stage();
        protected TextField textField;
    protected Label label;
    protected Button button;
    protected RadioButton radioButton;
    protected ChoiceBox choiceBox;
    protected Label label0;
    protected TextField textField0;
    protected TextField textField1;
    protected Label label1;
    protected Label label2;
    MainMenuADMIN ctcA =new MainMenuADMIN();
    @Override
    public void start(Stage stage3) {
        
        anchorPane = new AnchorPane();
        textField = new TextField();
        label = new Label();
        button = new Button();
        radioButton = new RadioButton();
        choiceBox = new ChoiceBox();
        label0 = new Label();
        textField0 = new TextField();
        textField1 = new TextField();
        label1 = new Label();
        label2 = new Label();


        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        textField.setLayoutX(383.0);
        textField.setLayoutY(211.0);
        textField.setPrefWidth(49.0);
        String seatNum=textField.getText();
      
        
        label.setLayoutX(322.0);
        label.setLayoutY(216.0);
        label.setPrefWidth(61.0);
        label.setText("Seats:");

        button.setLayoutX(22.0);
        button.setLayoutY(23.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(21.0);
        button.setPrefWidth(90.0);
        button.setText("Menu");
        button.setOnAction((ActionEvent e) -> {
        ctcA.start(MainMenuADMIN.stageA);
        stage3.close(); 
            
        });
        radioButton.setLayoutX(313.0);
        radioButton.setLayoutY(154.0);
        radioButton.setMnemonicParsing(false);
        radioButton.setPrefHeight(21.0);
        radioButton.setPrefWidth(113.0);
        radioButton.setText("Equipment");
 
        
        choiceBox.setItems(FXCollections.observableArrayList("Trinke","HCC","Woodard","Combs"));
        choiceBox.setLayoutX(92.0);
        choiceBox.setLayoutY(139.0);
        choiceBox.setPrefWidth(150.0);
   
        
       
        label0.setLayoutX(112.0);
        label0.setLayoutY(101.0);
        label0.setPrefHeight(21.0);
        label0.setPrefWidth(106.0);
        label0.setText("Building");

        textField0.setLayoutX(74.0);
        textField0.setLayoutY(237.0);

        textField1.setLayoutX(72.0);
        textField1.setLayoutY(303.0);

        label1.setLayoutX(75.0);
        label1.setLayoutY(206.0);
        label1.setPrefHeight(21.0);
        label1.setPrefWidth(90.0);
        label1.setText("Month");

        label2.setLayoutX(75.0);
        label2.setLayoutY(275.0);
        label2.setPrefHeight(21.0);
        label2.setPrefWidth(49.0);
        label2.setText("Date");
     
        anchorPane.getChildren().add(textField);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(radioButton);
        anchorPane.getChildren().add(choiceBox);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(textField0);
        anchorPane.getChildren().add(textField1);
        anchorPane.getChildren().add(label1);
        anchorPane.getChildren().add(label2);
        
        
          for (int i=0; i<roomList.size(); i++){
       // if (Integer.parseInt(roomList.get(i).getSeats().equals(seatNum)))  {
        //  System.out.println(roomList.get(i));  
       //}
        if (choiceBox.getSelectionModel().selectedIndexProperty().equals("Trinkle")){
            if(roomList.get(i).getBuilding().contains("Trinkle")){
                System.out.println(roomList.get(i));
        }
        }
        if (choiceBox.getSelectionModel().selectedIndexProperty().equals("HCC")){
            if(roomList.get(i).getBuilding().contains("HCC")){
                System.out.println(roomList.get(i));
        }
        }
        if (choiceBox.getSelectionModel().selectedIndexProperty().equals("Woodard")){
            if(roomList.get(i).getBuilding().contains("Woodard")){
                System.out.println(roomList.get(i));
        }
        }
        if (choiceBox.getSelectionModel().selectedIndexProperty().equals("Combs")){
            if(roomList.get(i).getBuilding().contains("Combs")){
                System.out.println(roomList.get(i));
        }
        }
         if (radioButton.isSelected()){
             if (roomList.get(i).getEquip()==true){
                 System.out.println(roomList.get(i));
             }
          
          
          }
          }
        
        
        
        
        
        
        
        
   
        Scene scene = new Scene(anchorPane, 450, 640);
        stage3.setTitle("Reserve a Room");
        stage3.setScene(scene);
        stage3.show();
   }
    
}
