package sample;

import javafx.beans.property.SimpleStringProperty;

public class User {

    private  final String log;
    private final String pas;


    public User(String log, String pas) {
        this.log = log;
        this.pas = pas;
    }

    public String getLog() {
        return log;
    }

    public String getPas() {
        return pas;
    }
}
