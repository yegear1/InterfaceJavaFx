package com.example.teste1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import java.io.IOException;

public class Main extends Application {

    private static Stage stage; // Variavel estaticas para fazer a mudança de tela
    private static Scene mainScene;
    private static Scene homeScene;


    @Override
    public void start(Stage primaryStage) throws Exception { // Metodo padrão do JavaFX
        stage = primaryStage; // inicializando a variavel stage

        primaryStage.setTitle("Drogaria Gobila");

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        mainScene = new Scene(fxmlLogin, 600, 400); // Cache tela 1

        Parent fxmlHome = FXMLLoader.load(getClass().getResource("Home.fxml"));
        homeScene = new Scene(fxmlHome, 800, 600); // Cache tela 2



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
        }
    }

    public static void main(String[] args) {
        launch();
    }
}