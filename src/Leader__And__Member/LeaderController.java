package Leader__And__Member;

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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Handlers;
import util.WindowStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LeaderController implements Initializable {

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private AnchorPane memberPane;

    @FXML
    public AnchorPane LeaderDashAnchor;

    DrawerContentController drawerContentController = new DrawerContentController();


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


            //Created an instance of the Hamburger class giving it a particular transition which is HamburgerBackArrowBasicTransition
            HamburgerBackArrowBasicTransition burgerTask = new HamburgerBackArrowBasicTransition(hamburger);

            //burgerTask.setRate controls the time taken for the hamburger button to turn into an arrow
            burgerTask.setRate(-1);

            hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                burgerTask.setRate(burgerTask.getRate() * -1);
                burgerTask.play();

                if (drawer.isClosed()) {
                    drawer.open();
                } else
                    drawer.close();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void back(ActionEvent event) throws Exception{
        Stage primaryStage = (Stage) memberPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Home/HomeScreen.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);

    }
}

