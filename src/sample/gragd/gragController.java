package sample.gragd;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import sample.DataBaseHeandler;
import sample.gorod.Gorod;

public class gragController {

    private ObservableList<Gragdanstvo> list = FXCollections.observableArrayList();

    private  String tableName = "gragd";

    final DataBaseHeandler dbHeandler = new DataBaseHeandler();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private Button addBut;

    @FXML
    private Button delBut;

    @FXML
    private TableView<Gragdanstvo> tableGor;

    @FXML
    private TableColumn<Gragdanstvo, String> idField;

    @FXML
    private TableColumn<Gragdanstvo, String> idName;

    @FXML
    private Button backBut;

    @FXML
    void initialize() {

        idField.setCellFactory(TextFieldTableCell.<Gragdanstvo>forTableColumn());
        idField.setCellValueFactory(new PropertyValueFactory<Gragdanstvo, String>("id"));
        idName.setCellFactory(TextFieldTableCell.<Gragdanstvo>forTableColumn());
        idName.setCellValueFactory(new PropertyValueFactory<Gragdanstvo, String>("name"));
        loadData();

        backBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/clientMod/clientM.fxml", backBut,"Модуль Клиенты");
            }
        });


        delBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String pos = ( tableGor.getSelectionModel().getSelectedItem().getId().toString());
                dbHeandler.deleteFromTable(tableName, pos);
                loadData();
            }
        });


        addBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!nameField.getText().equals(""))
                {
                    dbHeandler.insertInSprav(tableName, nameField.getText());
                    loadData();
                }else
                {
                    dbHeandler.showMesage("Заполните поле");
                }

            }
        });



    }


    void loadData(){

        list.clear();
        nameField.clear();
        tableGor.getItems().clear();
        ResultSet result = dbHeandler.getTable(tableName);
        Gragdanstvo obj;
        try {
            while (result.next()) {
                obj = new Gragdanstvo(result.getString(1), result.getString(2));
                list.add(obj);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        tableGor.setItems(list);
    }
}
