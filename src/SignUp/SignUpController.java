package SignUp;

//import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.*;

public class SignUpController {

    @FXML
    private AnchorPane SignUpPane;

    @FXML
    private Label createlabelaccount;

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