package sample.ival;

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
import sample.gragd.Gragdanstvo;

public class invController {
    private ObservableList<Invalind> list = FXCollections.observableArrayList();

    private  String tableName = "invalidn";

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
    private TableView<Invalind> table;

    @FXML
    private TableColumn<Invalind, String> idField;

    @FXML
    private TableColumn<Invalind, String> idName;

    @FXML
    private Button backBut;

    @FXML
    void initialize() {

        idField.setCellFactory(TextFieldTableCell.<Invalind>forTableColumn());
        idField.setCellValueFactory(new PropertyValueFactory<Invalind, String>("id"));
        idName.setCellFactory(TextFieldTableCell.<Invalind>forTableColumn());
        idName.setCellValueFactory(new PropertyValueFactory<Invalind, String>("name"));
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

                String pos = ( table.getSelectionModel().getSelectedItem().getId().toString());
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
        table.getItems().clear();
        ResultSet result = dbHeandler.getTable(tableName);
        Invalind obj;
        try {
            while (result.next()) {
                obj = new Invalind(result.getString(1), result.getString(2));
                list.add(obj);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        table.setItems(list);
    }
}
