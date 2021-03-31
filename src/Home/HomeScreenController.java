package Home;

import Leader__And__Member.DrawerContentController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Handlers;
import util.WindowStyle;

import java.net.URL;
import java.util.ResourceBundle;


public class HomeScreenController implements Initializable {

    @FXML
    private AnchorPane homePane;

    @FXML
    public ComboBox<String> comboBox;

    @FXML
    private Button nextBtn;

    @FXML
    private void close_label(){
        Handlers.closeApp();
    }

    ObservableList <String> menu = FXCollections.observableArrayList("Ministry Leader","Member");

    @FXML
    private void Min_label(MouseEvent mouseEvent) {
        Handlers.minimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }



    public void Leadernext() throws Exception{
        Stage primaryStage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Login/LoginPage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    public void Membernext() throws Exception{
        Stage primaryStage = (Stage) homePane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Leader__And__Member/LeaderDashBoard.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);
//
//        DrawerContentController drawerContentController = new DrawerContentController();
//        drawerContentController.addmember.setDisable(true);

        System.out.println("Reached here");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        comboBox.setOnAction((event) -> {
            try {
                comboSelected();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        comboBox.setItems(menu);
        }


    @FXML
    public void comboSelected() throws Exception {

        String item = comboBox.getValue();
        if(item != null){
            nextBtn.setDisable(false);
            if(item.equals("Ministry Leader")){
                nextBtn.setOnAction((event) -> {
                    try {
                        Leadernext();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }else {
                nextBtn.setOnAction((event) -> {
                    try {
                        Membernext();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        }
    }
}