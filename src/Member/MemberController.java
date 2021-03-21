package Member;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.Handlers;
import util.WindowStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MemberController implements Initializable {

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private AnchorPane memberPane;

    @FXML
    private void close_label(){
        Handlers.closeApp();
    }

    @FXML
    private void Min_label(MouseEvent mouseEvent) {
        Handlers.minimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("DrawerContent.fxml"));
            drawer.setSidePane(anchorPane);

            HamburgerBackArrowBasicTransition burgerTask = new HamburgerBackArrowBasicTransition(hamburger);
            burgerTask.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                burgerTask.setRate(burgerTask.getRate() * -1);
                burgerTask.play();

                if (drawer.isOpened()) {
                    drawer.close();
                } else
                    drawer.open();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void btn() throws Exception{
        Stage primaryStage = (Stage) memberPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/SignUp/SignUpView.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    public void btn1() throws Exception{
        Stage primaryStage = (Stage) memberPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Login/LoginPage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }

    public void back(ActionEvent event) throws Exception{
        Stage primaryStage = (Stage) memberPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Home/HomeScreen.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);
    }
}

