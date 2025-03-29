package com.example.bookstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }




    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "xzlkjc(8sdfj&f");
                System.out.println("Connected");
            } catch (SQLException e) {
                e.printStackTrace();  // This will print the exception details if something goes wrong
            }
            launch();  // Continue with the JavaFX application launch
        }


    }
//change
