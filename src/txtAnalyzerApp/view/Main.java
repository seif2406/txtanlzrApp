package txtAnalyzerApp.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*team:Makhloufi seif eddine, dib malak, Kefsi israe lina */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("main_view.fxml")
        );
        Scene scene = new Scene(loader.load(), 900, 600);

        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());


        stage.setTitle("txtAnalyzer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
