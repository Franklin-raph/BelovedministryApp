package Home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Handlers;
import util.WindowStyle;


public class HomeScreenController {

    @FXML
    private AnchorPane homePane;

    @FXML
    private void close_label(){
        Handlers.closeApp();
    }

    @FXML
    private void Min_label(MouseEvent mouseEvent) {
        Handlers.minimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    public void next() throws Exception{
        Stage primaryStage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Member/MemberDashBoard.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

}
