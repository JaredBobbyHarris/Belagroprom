package sample.clientMod;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.DataBaseHeandler;

public class clientMController {

    final DataBaseHeandler dbHeandler = new DataBaseHeandler();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button client;

    @FXML
    private Button gor;

    @FXML
    private Button gragd;

    @FXML
    private Button ival;

    @FXML
    private Button sp;

    @FXML
    private Button back;

    @FXML
    void initialize() {

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/mainForm/mainF.fxml", back,"Главная форма");
            }
        });


        gor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/gorod/gor.fxml", gor,"Город");
            }
        });

        gragd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/gragd/grag.fxml", gragd,"Гражданство");
            }
        });

        ival.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/ival/inv.fxml", ival,"Инвалидность");
            }
        });

        sp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/sp/sp.fxml", sp,"Семейное положение");
            }
        });

        client.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/clientPac/cl.fxml", sp,"Клиент");
            }
        });
    }
}
