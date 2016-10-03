import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;

public class CircleBindingEHZ extends Application {
    public void start(Stage bootup) {

        // Create a circle Object with empty constructor
        // basically a node, eventually it will bind with scene properties
        Circle myCircle = new Circle();
        myCircle.setFill(Color.CORAL);

        // root will constructed with Circle Object ..here this is a circle
        Group root = new Group(myCircle);

        // Java Scene Which will eventually give me a winodw
        // you have to attach root to your sceneGraph
        Scene myScene = new Scene(root, 400, 400, Color.MOCCASIN);

        // binding the CenterX, Centery and radius to the scene width and height
        // here beans.binding.Bindings library give us this opportunity
        myCircle.centerXProperty().bind(myScene.widthProperty().divide(2));
        myCircle.centerYProperty().bind(myScene.heightProperty().divide(2));
        myCircle.radiusProperty().bind(Bindings.min(myScene.widthProperty(), myScene.heightProperty()).divide(2));

        // bootup Stage is instanting in start() method
        // which is basically a abstract class
        // bootup Stage properties set and make it visible add it to Scene bootup
        bootup.setTitle("Bean Bindings Circle");
        bootup.setScene(myScene);
        bootup.sizeToScene();
        bootup.show();
    }

    public static void main(String... args) {
        launch(args);
    }
}
