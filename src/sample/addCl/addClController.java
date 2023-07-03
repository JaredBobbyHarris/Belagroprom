package sample.addCl;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sample.DataBaseHeandler;
import sample.clientPac.Client;

public class addClController {

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
    private Button backBut;

    @FXML
    private ComboBox<String> gorF;

    @FXML
    private TextField famF;

    @FXML
    private TextField dateF;

    @FXML
    private TextField nameF;

    @FXML
    private TextField otF;

    @FXML
    private TextField serF;

    @FXML
    private TextField nomF;

    @FXML
    private TextField vidF;

    @FXML
    private TextField datevF;

    @FXML
    private CheckBox polM;

    @FXML
    private CheckBox polG;

    @FXML
    private TextField idnF;

    @FXML
    private TextField mrF;

    @FXML
    private TextField adrF;

    @FXML
    private TextField teldF;

    @FXML
    private TextField telmF;

    @FXML
    private TextField mailF;

    @FXML
    private TextField rabF;

    @FXML
    private TextField dolF;

    @FXML
    private TextField gorpF;

    @FXML
    private TextField adrpF;

    @FXML
    private ComboBox<String> spF;

    @FXML
    private ComboBox<String> grF;

    @FXML
    private ComboBox<String> invF;

    @FXML
    private CheckBox penY;

    @FXML
    private CheckBox penN;

    @FXML
    private TextField dohF;

    @FXML
    private CheckBox voY;

    @FXML
    private CheckBox voN;

    @FXML
    void initialize() {

        dbHeandler.setForCombobox("gorod", "name", gorF);
        dbHeandler.setForCombobox("sp", "name", spF);
        dbHeandler.setForCombobox("gragd", "name", grF);
        dbHeandler.setForCombobox("invalidn", "name", invF);

        backBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dbHeandler.openNewScene("/sample/clientPac/cl.fxml", backBut,"Клиенты");
            }
        });

        addBut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                DataBaseHeandler dbHeandler = new DataBaseHeandler();


                String insert = "Insert into client(fam, name, otch, dater, pol, serPas, nomPas, vidan, datev, idnomPas, mestoRog, id_gorP, "
                        + "adrP, telD, telM, mail, rabota, dolgn, gorPr, adrPr, id_sp, id_gr, id_inv, pens, dohod, voen) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                String pol;


                try {

                    PreparedStatement pr = dbHeandler.getDbConnection().prepareStatement(insert);

                    pr.setString(1, famF.getText());
                    pr.setString(2, nameF.getText());
                    pr.setString(3, otF.getText());
                    pr.setString(4, dateF.getText());
                    if(polM.selectedProperty().getValue()){
                        pr.setInt(5, 1);
                    }else {
                        pr.setInt(5, 0);
                    }

                    pr.setString(6, serF.getText());
                    pr.setString(7, nomF.getText());
                    pr.setString(8, vidF.getText());
                    pr.setString(9, datevF.getText());
                    pr.setString(10, idnF.getText());
                    pr.setString(11, mrF.getText());
                    pr.setInt(12, dbHeandler.fieldToId("gorod","name", gorF.getValue()));
                    pr.setString(13, adrF.getText());
                    pr.setString(14, teldF.getText());
                    pr.setString(15, telmF.getText());
                    pr.setString(16, mailF.getText());
                    pr.setString(17, rabF.getText());
                    pr.setString(18, dolF.getText());
                    pr.setString(19, gorpF.getText());
                    pr.setString(20, adrpF.getText());
                    pr.setInt(21, dbHeandler.fieldToId("sp","name", spF.getValue()));
                    pr.setInt(22, dbHeandler.fieldToId("gragd","name", grF.getValue()));
                    pr.setInt(23, dbHeandler.fieldToId("invalidn","name", invF.getValue()));

                    if(penY.selectedProperty().getValue()){
                        pr.setInt(24, 1);
                    }else {
                        pr.setInt(24, 0);
                    }
                    pr.setString(25, dohF.getText());
                    if(voY.selectedProperty().getValue()){
                        pr.setInt(26, 1);
                    }else {
                        pr.setInt(26, 0);
                    }

                    pr.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                famF.clear();
                nameF.clear();
                otF.clear();
                dateF.clear();
                serF.clear();
                nomF.clear();
                vidF.clear();
                datevF.clear();
                idnF.clear();
                mrF.clear();
                adrF.clear();
                telmF.clear();
                teldF.clear();
                mailF.clear();
                rabF.clear();
                dolF.clear();
                gorpF.clear();
                adrpF.clear();
                dohF.clear();




                dbHeandler.showMesage("Вы успешно добавили запись");


            }
        });



    }
}
