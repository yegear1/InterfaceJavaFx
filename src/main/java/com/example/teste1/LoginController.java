package com.example.teste1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginController {
    @FXML
    protected void LoginAction(ActionEvent e) {
        Main.changedScene("home");
    }

}