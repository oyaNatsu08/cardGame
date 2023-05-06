package com.example.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class gameMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //fxmlファイルを準備
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Parent root = fxmlLoader.load();
        ScrollPane scrollPane = new ScrollPane(root);

        //画面サイズと呼び出すfxmlファイルを決める
        Scene scene = new Scene(scrollPane);
        //タイトルを決める
        stage.setTitle("GameStart!");
        stage.setScene(scene);
        stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
        stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
        //画面に表示する
        stage.show();
    }

    public static void main(String[] args) {
        //Applicationクラスのメソッド、自動でstartメソッドなどを呼び出す
        launch();
    }

}
