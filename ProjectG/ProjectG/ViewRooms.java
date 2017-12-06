/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import static com.Room.viewRoom;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ViewRooms extends Application  {
    protected TableView<Room> rtv = new TableView<>();
    protected  TableColumn tableColumn;
    protected  TableColumn tableColumn0;
    protected TableColumn tableColumn1;

     @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Rooms");
        stage.setWidth(300);
        stage.setHeight(500); {
        rtv.setEditable(true);
        TableColumn<Room, String> buildingColumn = new TableColumn<>("Building");
        TableColumn<Room, String> roomColumn = new TableColumn<>("Room");
        TableColumn<Room, Boolean> equipColumn = new TableColumn<>("Equipment");
        TableColumn<Room, Integer> seatColumn = new TableColumn<>("Seats");
        TableColumn<Room, Boolean> availColumn = new TableColumn<>("Availability");
        
        buildingColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getBuilding()));
        
        roomColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getRName()));
        
         equipColumn.setCellValueFactory(cellData ->
                new SimpleBooleanProperty(cellData.getValue().getEquip()));
        
        // seatColumn.setCellValueFactory(cellData ->
        //        new SimpleIntegerProperty(cellData.getValue().getSeats()));
         
         availColumn.setCellValueFactory(cellData ->
                new SimpleBooleanProperty(cellData.getValue().getAvailability()));
         
        rtv.setItems(viewRoom);
        rtv.getColumns().addAll(buildingColumn,roomColumn,equipColumn,seatColumn,availColumn);
        
      
        
       final Label label = new Label("Room List");
        label.setFont(new Font("Arial", 20));


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, rtv);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
}
}