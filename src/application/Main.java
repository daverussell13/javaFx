package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.*;
import javafx.scene.input.KeyCombination;
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

    // get an image icon (javafx.scene.image)
    Image icon = new Image("./icon.png");
    stage.getIcons().add(icon);

    // set title of a stage (javafx.stage.Stage)
    stage.setTitle("Stage demo program");

    // set height and width
    stage.setWidth(420);
    stage.setHeight(420);

    // disable resize
    stage.setResizable(false);

    // open in fullscreen mode
    stage.setFullScreen(true);
    stage.setFullScreenExitHint("You cant quit unless press q");
    // set key to quit full screen
    stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

    // set a scene before showing it
    stage.setScene(scene);
    stage.show();
  }
}
