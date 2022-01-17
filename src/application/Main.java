package application;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    Group root = new Group();
    // set width, height, and color of a scene
    Scene scene = new Scene(root,600,600,Color.LIGHTSKYBLUE);

    Text text = new Text();
    text.setText("Testt....");

    // set position
    text.setX(50);
    text.setY(50);
    // set font of the text
    text.setFont(Font.font("Verdana",50));
    text.setFill(Color.LIMEGREEN);

    // creating line
    Line line = new Line();
    line.setStartX(200);
    line.setStartY(200);
    line.setEndX(500);
    line.setEndY(200);
    line.setStrokeWidth(5);
    line.setStroke(Color.RED);
    line.setOpacity(0.5);
    line.setRotate(45);

    // Rectangle
    Rectangle rectangle = new Rectangle();
    rectangle.setX(100);
    rectangle.setY(100);
    rectangle.setWidth(100);
    rectangle.setHeight(100);
    rectangle.setFill(Color.BLUE);
    // rectangle border
    rectangle.setStrokeWidth(5);
    rectangle.setStroke(Color.BLACK);

    // Triangle
    Polygon triangle = new Polygon();
    triangle.getPoints().setAll(
      200.0,200.0,
      300.0,300.0,
      200.0,300.0
    );
    triangle.setFill(Color.YELLOW);

    Circle circle = new Circle();
    circle.setCenterX(350);
    circle.setCenterY(350);
    circle.setRadius(50);
    circle.setFill(Color.ORANGE);

    root.getChildren().add(text);
    root.getChildren().add(line);
    root.getChildren().add(rectangle);
    root.getChildren().add(triangle);
    root.getChildren().add(circle);
    stage.setScene(scene);
    stage.show();
  }
}
