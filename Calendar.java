package calendar;

import java.util.Locale;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Keri
 */
public class Calendar extends Application {

    private Stage stage;
    DatePicker checkInDatePicker = new DatePicker();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        initUI(stage);
    }

    private void initUI(Stage stage) {
        Pane base = new Pane();
        Scene scene = new Scene(base, 500, 400, Color.WHITESMOKE);
        stage.setTitle("Reservation Calendar");
        
        DatePicker datePicker = new DatePicker();
        base.getChildren().add(datePicker);
        
        
        stage.setScene(scene);
        stage.show();
    }

}


