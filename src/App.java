import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage StagePrimario) {
        try {
                Parent root = FXMLLoader.load(getClass().getResource("vista/main.fxml"));
                StagePrimario.setTitle("JQuickForm");
                StagePrimario.setScene(new Scene(root));
                StagePrimario.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}