package Leader__And__Member;

import Home.HomeScreenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.WindowStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class DrawerContentController implements Initializable {

    @FXML
    private AnchorPane DrawerPane;

    @FXML
    public Button editdetails, addmember, about, records, activities;

    @FXML
    public void addMember() throws Exception{
        Stage primaryStage = (Stage) DrawerPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/SignUp/SignUpView.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    @FXML
    public void about() throws Exception{
        Stage primaryStage = (Stage) DrawerPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Leader__And__Member/LeaderDashAnchor.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    @FXML
    public void activities() throws Exception{
        Stage primaryStage = (Stage) DrawerPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Login/LoginPage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    @FXML
    public void records() throws Exception{
        Stage primaryStage = (Stage) DrawerPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Login/LoginPage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    @FXML
    public void editDetails() throws Exception{
        Stage primaryStage = (Stage) DrawerPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Login/LoginPage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
