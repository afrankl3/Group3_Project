package com.example.dropdownsample;

import com.dropdown.DropDown;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

import static java.awt.SystemColor.window;
import static javafx.application.Application.launch;

public class DropDownSample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        stage.setTitle("DropDownSample");
        Scene scene = new Scene(new Group(),450,250);


       //DropDown drop = new DropDown();
        final ComboBox<String> dropDown = new ComboBox<>();
        dropDown.getItems().addAll(
                "Hurley Convergence Center","Jepson Science Center","Lee Hall","Simpson Library","University Center"

        );
        dropDown.setValue("Buildings");

        GridPane gridPane= new GridPane();
        gridPane.setVgap(4);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.add(new Label("Buildings: "), 0, 0);
        gridPane.add(dropDown, 1,0);

        Group root = (Group) scene.getRoot();
        root.getChildren().add(dropDown);
        stage.setScene(scene);
        stage.show();
    }


}
