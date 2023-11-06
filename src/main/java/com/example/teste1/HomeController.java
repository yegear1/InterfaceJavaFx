package com.example.teste1;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HomeController{

    @FXML
    protected void HomeAction(MouseEvent e) {
        Main.changedScene("home");
    }
    @FXML
    protected void FuncAction(MouseEvent e) {
        Main.changedScene("func");
    }
    @FXML
    protected void MedAction(MouseEvent e) {
        Main.changedScene("med");
    }
    @FXML
    protected void ResgAction(MouseEvent e) {
        Main.changedScene("resg");
    }
    @FXML
    protected void AdminAction(MouseEvent e) {
        Main.changedScene("admin");
    }

}