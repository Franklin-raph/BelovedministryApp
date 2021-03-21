package Login;

//import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    Connection connection;

    public LoginModel(){
//        try{
////            this.connection = DbConnection.connect();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        if(this.connection == null){
//            System.exit(1);
//        }

    }
    public boolean isDBCoonneted(){
        return this.connection != null;
    }

    public boolean isLogin(String username, String password) throws SQLException{
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String dbQuery = "SELECT * FROM LoginTable WHERE username = ? and password = ?";
        try{
            preparedStatement = connection.prepareStatement(dbQuery);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                return true;
            }else{
                return false;
            }

        }catch (SQLException e){
            return false;
        }finally {
            preparedStatement.close();
            resultSet.close();
        }
    }
}