/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SignInBase extends VBox {
    
protected final AnchorPane anchorPane;
    protected final Label label;
    protected final PasswordField passwordField;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final Button button;
    protected final Button button0;

    public SignInBase() {

        anchorPane = new AnchorPane();
        label = new Label();
        passwordField = new PasswordField();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        button = new Button();
        button0 = new Button();

        setPrefHeight(400.0);
        setPrefWidth(640.0);

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
            String text = textField1.getText();
            //See if we can apply the signUp method to this, otherwise implement manually
         });
        button0.setLayoutX(33.0);
        button0.setLayoutY(14.0);
        button0.setMnemonicParsing(false);
        button0.setText("Back to Guest View");
        button0.setOnAction((ActionEvent e) -> {
        
        //Return to the main calandar view
        });
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(passwordField);
        anchorPane.getChildren().add(textField);
        anchorPane.getChildren().add(textField0);
        anchorPane.getChildren().add(textField1);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        getChildren().add(anchorPane);

    }
}
