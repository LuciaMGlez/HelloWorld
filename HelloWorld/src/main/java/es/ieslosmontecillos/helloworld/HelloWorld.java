package es.ieslosmontecillos.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) throws IOException {
           Button btn = new Button();
           btn.setText("Say 'Hello World'");
           btn.setOnAction(new EventHandler<ActionEvent>(){ //instancia manejador de eventos
               public void handle(ActionEvent event) {
                   System.out.println("Hello World!");
               }
           });
           StackPane root = new StackPane();
           root.getChildren().add(btn);

           Scene scene = new Scene(root, 300, 250);
           stage.setTitle("Hello World");
           stage.setScene(scene);
           stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}