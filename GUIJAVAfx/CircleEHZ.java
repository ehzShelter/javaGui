import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleEHZ extends Application {
    public void start(Stage bootup) {

        // Create a circle Object
        // basically a leaf node
        Circle myCircle = new Circle(200, 200, 100);
        myCircle.setFill(Color.CORAL);

        // root is capturing child node ..here this is a circle
        Group root = new Group();
        root.getChildren().add(myCircle);

        // Java Scene Which will eventually give me a winodw
        // you have to attach root to your sceneGraph
        Scene myScene = new Scene(root, 400, 400, Color.MOCCASIN);

        // bootup Stage is instanting in start() method
        // which is basically a abstract class
        // bootup Stage properties set and make it visible add it to Scene bootup

        bootup.setTitle("JAVAFX Circle");
        bootup.setScene(myScene);
        bootup.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}
