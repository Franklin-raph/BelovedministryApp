package util;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Handlers {

    public static void minimize(Stage stage){
        if(stage!= null){
            stage.setIconified(true);
        }

    }

    public static void closeApp(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure exit?", ButtonType.YES,ButtonType.CANCEL);
        alert.setTitle("Confirm Exit");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.YES)){
            Platform.exit();

        }
    }
}
