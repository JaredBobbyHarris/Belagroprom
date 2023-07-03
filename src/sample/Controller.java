package sample;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField pasField;

    @FXML
    private Button loginButton;

    @FXML
    private Button regButton;

    @FXML
    void initialize() {
        final DataBaseHeandler dbHendler = new DataBaseHeandler();

        regButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                dbHendler.openNewScene("/sample/registration/reg.fxml", regButton,"Регистрация");

            }
        });


        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String loginText = loginField.getText().trim();
                String loginPassword = pasField.getText().trim();

                if(!loginText.equals("") && !loginPassword.equals("")){

                    loginUser(loginText, loginPassword);
                }else {
                    System.out.println("Error. Login and password is empty");
                }
            }
        });


    }


    private void loginUser(String loginText, String loginPassword) {

        DataBaseHeandler dbHeandler = new DataBaseHeandler();
        User user = new User(loginText, loginPassword);

        ResultSet result = dbHeandler.getUser(user);

        int counter = 0;
        try {
            while (result.next()) {
                counter++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        if(counter >= 1){

            dbHeandler.openNewScene("/sample/mainForm/mainF.fxml", loginButton, "Главная форма");

        }else {

            dbHeandler.showMesage("В базе данных нет такого пользователя");

        }

    }
}
