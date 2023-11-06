package com.example.teste1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stage; // Variavel estaticas para fazer a mudança de tela

    private static Scene mainScene, homeScene, funcScene, medScene, resgScene, adminScene;

    @Override
    public void start(Stage primaryStage) throws Exception { // Metodo padrão do JavaFX
        stage = primaryStage; // inicializando a variavel stage

        primaryStage.setTitle("Drogaria Gobila");

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        mainScene = new Scene(fxmlLogin, 600, 400); // Cache tela 1

        Parent fxmlHome = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        homeScene = new Scene(fxmlHome, 800, 600); // Cache tela 2

        Parent fxmlFunc = FXMLLoader.load(getClass().getResource("funcPage.fxml"));
        funcScene = new Scene(fxmlFunc, 800, 600); // Cache tela 3

        Parent fxmlMed = FXMLLoader.load(getClass().getResource("medPage.fxml"));
        medScene = new Scene(fxmlMed, 800, 600); // Cache tela 4

        Parent fxmlResg = FXMLLoader.load(getClass().getResource("resgPage.fxml"));
        resgScene = new Scene(fxmlResg, 800, 600); // Cache tela 5

        Parent fxmlAdmin = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        adminScene = new Scene(fxmlAdmin, 800, 600); // Cache tela 5

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TelaLogin.fxml"));

        primaryStage.setScene(mainScene); // Definindo tela principal/inicial
        primaryStage.show(); // mostrando a cena
    }

    public static void changedScene(String scr){ // metodo que muda a tela
        switch (scr){
            case "main":
                stage.setScene(mainScene);
                break;
            case "home":
                stage.setScene(homeScene);
                break;
            case "func":
                stage.setScene(funcScene);
                break;
            case "med":
                stage.setScene(medScene);
                break;
            case "resg":
                stage.setScene(resgScene);
                break;
            case "admin":
                stage.setScene(adminScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}