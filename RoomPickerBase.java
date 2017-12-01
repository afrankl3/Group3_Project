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
import static com.VariousMethods.roomList;
import javafx.event.ActionEvent;

public class RoomPickerBase extends AnchorPane {
    
 protected final SplitMenuButton splitMenuButton;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final ChoiceBox choiceBox;
    protected final FXCollections fXCollections;
    protected final Label label;
    protected final CheckBox checkBox;
    protected final TextField textField;
    protected final Label label0;

    public RoomPickerBase() {

        splitMenuButton = new SplitMenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        choiceBox = new ChoiceBox();
        fXCollections = new FXCollections();
        label = new Label();
        checkBox = new CheckBox();
        textField = new TextField();
        label0 = new Label();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        splitMenuButton.setLayoutX(57.0);
        splitMenuButton.setLayoutY(125.0);
        splitMenuButton.setMnemonicParsing(false);
        splitMenuButton.setText("Building");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Trinkle");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("HCC");

        choiceBox.setLayoutX(314.0);
        choiceBox.setLayoutY(122.0);
        choiceBox.setPrefWidth(93.0);

        label.setLayoutX(245.0);
        label.setLayoutY(125.0);
        label.setPrefWidth(69.0);
        label.setText("Room #");

        checkBox.setLayoutX(70.0);
        checkBox.setLayoutY(319.0);
        checkBox.setMnemonicParsing(false);
        checkBox.setText("Equiptment");
        checkBox.setOnAction((ActionEvent e) -> {
        //apply eqiptmentSearch() from VariousMethods, otherwise apply the method manually
        });
        textField.setLayoutX(358.0);
        textField.setLayoutY(319.0);
        textField.setPrefWidth(49.0);
        int text = Integer.parseInt(textField.getText());
        for (int i=0; i<roomList.size(); i++){
            if (text>roomList.get(i).getSeats()){
                //Sort rooms
            }
        }
        
        label0.setLayoutX(289.0);
        label0.setLayoutY(319.0);
        label0.setPrefWidth(61.0);
        label0.setText("Seats:");
        
        
        splitMenuButton.getItems().add(menuItem);
        splitMenuButton.getItems().add(menuItem0);
        getChildren().add(splitMenuButton);
        choiceBox.getItems().add(fXCollections);
        getChildren().add(choiceBox);
        getChildren().add(label);
        getChildren().add(checkBox);
        getChildren().add(textField);
        getChildren().add(label0);

    }
}
