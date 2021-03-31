import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.WindowStyle;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home/HomeScreen.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        Image image = new Image(getClass().getResourceAsStream("/resources/images/Bl.png"));
//        primaryStage.getIcons().add(image);

        WindowStyle.allowDrag(root,primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
