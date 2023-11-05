package com.example.teste1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeLoginController {
    @FXML
    protected void LoginAction(ActionEvent e) {
        Main.changedScene("home");
    }
}