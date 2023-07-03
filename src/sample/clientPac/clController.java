package sample.clientPac;

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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import sample.DataBaseHeandler;
import sample.ival.Invalind;

public class clController {

    private ObservableList<Client> list = FXCollections.observableArrayList();

    private  String tableName = "client";

    final DataBaseHeandler dbHeandler = new DataBaseHeandler();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addBut;

    @FXML
    private Button delBut;

    @FXML
    private TableView<Client> table;

    @FXML
    private TableColumn<Client, String> idField;

    @FXML
    private TableColumn<Client, String> idfam;

    @FXML
    private TableColumn<Client, String> idname;

    @FXML
    private TableColumn<Client, String> idot;

    @FXML
    private TableColumn<Client, String> iddate;

    @FXML
    private TableColumn<Client, String> idpol;

    @FXML
    private TableColumn<Client, String> idser;

    @FXML
    private TableColumn<Client, String> idnomp;

    @FXML
    private TableColumn<Client, String> idvidan;


    @FXML
    private TableColumn<Client, String> iddatev;

    @FXML
    private TableColumn<Client, String> ididn;

    @FXML
    private TableColumn<Client, String> idmesto;

    @FXML
    private TableColumn<Client, String> idgor;

    @FXML
    private TableColumn<Client, String> idadr;

    @FXML
    private TableColumn<Client, String> idteld;

    @FXML
    private TableColumn<Client, String> idtelm;

    @FXML
    private TableColumn<Client, String> idmail;

    @FXML
    private TableColumn<Client, String> idmr;

    @FXML
    private TableColumn<Client, String> iddol;

    @FXML
    private TableColumn<Client, String> idgorp;

    @FXML
    private TableColumn<Client, String> idadrp;

    @FXML
    private TableColumn<Client, String> idsp;

    @FXML
    private TableColumn<Client, String> idgrag;

    @FXML
    private TableColumn<Client, String> idinv;

    @FXML
    private TableColumn<Client, String> iddoh;

    @FXML
    private TableColumn<Client, String> idpens;

    @FXML
    private TableColumn<Client, String> idvoen;

    @FXML
    private Button backBut;



    @FXML
    void initialize() {

        idField.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idField.setCellValueFactory(new PropertyValueFactory<Client, String>("id"));

        idfam.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idfam.setCellValueFactory(new PropertyValueFactory<Client, String>("fam"));

        idname.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idname.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));

        idot.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idot.setCellValueFactory(new PropertyValueFactory<Client, String>("otch"));

        iddate.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        iddate.setCellValueFactory(new PropertyValueFactory<Client, String>("date"));

        idpol.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idpol.setCellValueFactory(new PropertyValueFactory<Client, String>("pol"));

        idser.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idser.setCellValueFactory(new PropertyValueFactory<Client, String>("serP"));

        idnomp.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idnomp.setCellValueFactory(new PropertyValueFactory<Client, String>("nomP"));

        idvidan.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idvidan.setCellValueFactory(new PropertyValueFactory<Client, String>("vidan"));

        iddatev.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        iddatev.setCellValueFactory(new PropertyValueFactory<Client, String>("dateV"));

        ididn.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        ididn.setCellValueFactory(new PropertyValueFactory<Client, String>("idn"));

        idmesto.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idmesto.setCellValueFactory(new PropertyValueFactory<Client, String>("mesto"));

        idgor.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idgor.setCellValueFactory(new PropertyValueFactory<Client, String>("gor"));

        idadr.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idadr.setCellValueFactory(new PropertyValueFactory<Client, String>("adr"));

        idteld.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idteld.setCellValueFactory(new PropertyValueFactory<Client, String>("teld"));

        idtelm.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idtelm.setCellValueFactory(new PropertyValueFactory<Client, String>("telm"));

        idmail.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idmail.setCellValueFactory(new PropertyValueFactory<Client, String>("mail"));

        idmr.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idmr.setCellValueFactory(new PropertyValueFactory<Client, String>("rab"));

        iddol.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        iddol.setCellValueFactory(new PropertyValueFactory<Client, String>("dol"));

        idgorp.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idgorp.setCellValueFactory(new PropertyValueFactory<Client, String>("gorp"));

        idadrp.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idadrp.setCellValueFactory(new PropertyValueFactory<Client, String>("adrp"));

        idsp.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idsp.setCellValueFactory(new PropertyValueFactory<Client, String>("sp"));

        idgrag.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idgrag.setCellValueFactory(new PropertyValueFactory<Client, String>("grag"));

        idinv.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idinv.setCellValueFactory(new PropertyValueFactory<Client, String>("inv"));

        idpens.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idpens.setCellValueFactory(new PropertyValueFactory<Client, String>("pens"));


        iddoh.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        iddoh.setCellValueFactory(new PropertyValueFactory<Client, String>("doh"));

        idvoen.setCellFactory(TextFieldTableCell.<Client>forTableColumn());
        idvoen.setCellValueFactory(new PropertyValueFactory<Client, String>("vo"));

        loadData();

        delBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String pos = ( table.getSelectionModel().getSelectedItem().getId().toString());
                dbHeandler.deleteFromTable(tableName, pos);
                loadData();
            }
        });

        backBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/clientMod/clientM.fxml", backBut,"Модуль Клиенты");
            }
        });

        addBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/addCl/addcl.fxml", addBut,"Добавление");
            }
        });

    }

    void loadData(){

        list.clear();
        table.getItems().clear();
        ResultSet result = dbHeandler.getTable("clientview");
        Client obj;
        try {
            while (result.next()) {
                String pol;
                String pens;
                String vo;

                obj = new Client(result.getString(1), result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5), result.getString(6), result.getString(7),
                        result.getString(8), result.getString(9), result.getString(10), result.getString(11),
                        result.getString(12), result.getString(13), result.getString(14), result.getString(15),
                        result.getString(16), result.getString(17), result.getString(18), result.getString(19),
                        result.getString(20), result.getString(21), result.getString(22), result.getString(23),
                        result.getString(24), result.getString(25), result.getString(26), result.getString(27));

               //obj = new Client();

                pol =  result.getString(6);
                if( pol.equals("1")){
                    obj.setPol("Мужской");
                }else{
                    obj.setPol("Женский");
                }

                pens =  result.getString(25);
                if( pens.equals("1")){
                    obj.setPens("Да");
                }else{
                    obj.setPens("Нет");
                }


                vo =  result.getString(27);
                if( vo.equals("1")){
                    obj.setVo("Да");
                }else{
                    obj.setVo("Нет");
                }

                list.add(obj);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        table.setItems(list);
    }



}
