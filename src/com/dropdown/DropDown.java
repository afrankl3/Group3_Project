package com.dropdown;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class DropDown {
    ObservableList<String> buildings = FXCollections.observableArrayList(
      "Hurley Convergence Center","Jepson Science Center","Lee Hall","Simpson Library","University Center"
    );
    final ComboBox comboBox = new ComboBox(buildings);

}
