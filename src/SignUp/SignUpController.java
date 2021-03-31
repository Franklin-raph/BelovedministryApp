package SignUp;

//import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Handlers;
import util.WindowStyle;

public class SignUpController {

    @FXML
    private AnchorPane SignUpPane;

    @FXML
    private Label createlabelaccount;


    @FXML
    private void close_label(){
        Handlers.closeApp();
    }

    @FXML
    private void Min_label(MouseEvent mouseEvent) {
        Handlers.minimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    public void back(ActionEvent event) throws Exception{
        Stage primaryStage = (Stage) SignUpPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Leader__And__Member/LeaderDashBoard.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        WindowStyle.allowDrag(root, primaryStage);
    }

//    @FXML
//    private void insertDetails(ActionEvent event){
//        if(this.username.getText().isEmpty() && this.password.getText().isEmpty()){
//            this.createlabelaccount.setText("   Pls Enter The Valid Details");
//        }else{
//            String dbQuery = "INSERT INTO LoginTable (username, password) VALUES (?, ?)";
//            try {
////                Connection connection = DbConnection.connect();
////                PreparedStatement preparedStatement = connection.prepareStatement(dbQuery);
//
////                preparedStatement.setString(1, this.username.getText());
////                preparedStatement.setString(2, this.password.getText());
////
////                preparedStatement.execute();
////                connection.close();
////            } catch (SQLException ex){
////                ex.printStackTrace();
////            }
////        }
////    }
}