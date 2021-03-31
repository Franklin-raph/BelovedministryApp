package Login;

//import Student.StudentDashBoardController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Handlers;
import util.WindowStyle;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label loginlabel;

    @FXML
    private Button signUpId;

    @FXML
    private Label min_Label;

    @FXML
    private AnchorPane LoginPane;

    @FXML
    private void close_label(MouseEvent mouseEvent){
        Handlers.closeApp();
    }

    @FXML
    private void Min_label(MouseEvent mouseEvent) {
        Handlers.minimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    LoginModel loginModel = new LoginModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(loginModel.isDBCoonneted()){
            System.out.println("Connected");
        }else{
            System.out.println("Not connected");
        }
    }

    @FXML
    public void Login(ActionEvent event) throws Exception {
//        try{
//            if(loginModel.isLogin(username.getText(), password.getText())){
//                ((Node)event.getSource()).getScene().getWindow().hide();
//
//                Stage primaryStage = new Stage();
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                Pane root = fxmlLoader.load(getClass().getResource("/Student/StudentDashBoardView.fxml").openStream());
//
//                StudentDashBoardController afterLoginController = (StudentDashBoardController)fxmlLoader.getController();
//                afterLoginController.welcome(username.getText());
//                primaryStage.initStyle(StageStyle.UNDECORATED);
//
//                primaryStage.setTitle("Dash Board");
//                primaryStage.setScene(new Scene(root));
//                primaryStage.show();
//
//                WindowStyle.allowDrag(root,primaryStage);
//            }else {
//                loginlabel.setText("Invalid Username or Password");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }

    @FXML
    public void signUp(ActionEvent event) throws Exception{

    }

    @FXML
    private void signUpEntered(){
        signUpId.setStyle("-fx-text-fill: #eb1123");
    }

    @FXML
    private void signUpExited(){
        signUpId.setStyle("-fx-text-fill: #ffffff");
    }

    public void back(ActionEvent event) throws Exception{
        Stage primaryStage = (Stage) LoginPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Home/HomeScreen.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);
    }
}
