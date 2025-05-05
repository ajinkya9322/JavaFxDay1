package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class app extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("My JavaFX Window");
        stage.getIcons().add(new Image("assets/images/student.jpg"));
        stage.setX(50);
        stage.setY(50);
        stage.setWidth(1800);
        stage.setHeight(1000);
        stage.setResizable(true);

        stage.show();
    }
}
