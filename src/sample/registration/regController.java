package sample.registration;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.DataBaseHeandler;

public class regController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField pasField;

    @FXML
    private Button regButton;

    @FXML
    private TextField adrField;

    @FXML
    private TextField telField;

    @FXML
    private TextField fioField;

    @FXML
    private Button backBut;

    @FXML
    void initialize() {

        final DataBaseHeandler dbHeandler = new DataBaseHeandler();

        backBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                dbHeandler.openNewScene("/sample/sample.fxml", backBut, "Авторизация");

            }
        });

        regButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                DataBaseHeandler dbHeandler = new DataBaseHeandler();


                String insert = "INSERT INTO sotr(FIO, adr, tel, log, pas ) VALUES(?,?,?,?,?)";

                try {

                    PreparedStatement pr = dbHeandler.getDbConnection().prepareStatement(insert);


                    pr.setString(1, fioField.getText());
                    pr.setString(2, adrField.getText());
                    pr.setString(3, telField.getText());
                    pr.setString(4, loginField.getText());
                    pr.setString(5, pasField.getText());

                    pr.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                dbHeandler.showMesage("Вы успешно зарегестрировались");
                dbHeandler.openNewScene("/sample/sample.fxml", regButton, "Авторизация");

            }
        });


    }
}
