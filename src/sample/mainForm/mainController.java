package sample.mainForm;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.DataBaseHeandler;

public class mainController {

    final DataBaseHeandler dbHeandler = new DataBaseHeandler();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button butCl;

    @FXML
    private Button butDep;

    @FXML
    void initialize() {

        butCl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/clientMod/clientM.fxml", butCl,"Модуль Клиенты");
            }
        });


            }

    }

