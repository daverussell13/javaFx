package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    // making a scene
    Group root = new Group();
    Scene scene = new Scene(root,Color.BLACK);

    stage.setTitle("Stage demo program");
    stage.setScene(scene);
    stage.show();
  }
}
