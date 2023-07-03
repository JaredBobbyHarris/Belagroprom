package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DataBaseHeandler extends Configs {


    Connection dbConnection;


    public ResultSet getUser(User user){
        ResultSet reSet = null;
        String query = "SELECT * FROM reg where log = '" + user.getLog() + "' and pas = '" + user.getPas() + "'" ;
        try {
            PreparedStatement pr = getDbConnection().prepareStatement(query);
            reSet = pr.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  reSet;
    }

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {

        String connectionString  = "jdbc:mysql://" + hostName + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, userName, password);

        return  dbConnection;

    }

    public void insertInSprav(String table, String val){

        DataBaseHeandler dbHeandler = new DataBaseHeandler();
        String insert = "insert into " + table+ "(name) values('" + val + "')";

        try {
            PreparedStatement pr = dbHeandler.getDbConnection().prepareStatement(insert);
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public  void deleteFromTable(String table, String id){

        DataBaseHeandler dbHeandler = new DataBaseHeandler();
        String insert = "Delete from " + table+ " where id = " + id;

        try {
            PreparedStatement pr = dbHeandler.getDbConnection().prepareStatement(insert);
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        showMesage("Запись удалена");

    }

    public ResultSet getTable(String table){
        ResultSet reSet = null;
        String query = "SELECT * FROM " + table;
        try {
            PreparedStatement pr = getDbConnection().prepareStatement(query);
            reSet = pr.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  reSet;
    }


    public void setForCombobox(String table, String field, ComboBox<String> cb){
        ResultSet reSet = null;
        String query = "SELECT " + field + " FROM " + table;
        try {

            PreparedStatement pr = getDbConnection().prepareStatement(query);
            reSet = pr.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while (reSet.next()) {
                cb.getItems().addAll(reSet.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int fieldToId(String table, String field, String value){
        ResultSet reSet = null;

        String query = "SELECT id  FROM " + table + " where  " + field + " = '" + value + "'";

        try {

            PreparedStatement pr = getDbConnection().prepareStatement(query);
            reSet = pr.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int res = 0;

        try {
            reSet.next();
            res = reSet.getInt(1);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  res;
    }

    public void showMesage(String mess){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Уведомление");
        alert.setHeaderText(null);
        alert.setContentText(mess);
        alert.showAndWait();
    }

    public void openNewScene(String window, Button but, String title){

        Stage stage = (Stage) but.getScene().getWindow();
        // do what you have to do
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(window));
        try{
            Parent root1 = (Parent) fxmlLoader.load();


            stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(title);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
