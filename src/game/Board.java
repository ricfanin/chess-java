package game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Board extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(400, 400);

        Color lightColor = Color.WHITE;
        Color darkColor = Color.GRAY;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle rectangle = new Rectangle(50, 50);
                rectangle.setFill((row + col) % 2 == 0 ? lightColor : darkColor);
                gridPane.add(rectangle, col, row);
            }
        }

        root.getChildren().add(gridPane);

        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void display() {
        launch();
    }
}
