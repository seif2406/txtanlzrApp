package txtAnalyzerApp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;

public class MainController {

    @FXML
    private ListView<String> filesList;

    @FXML
    private void onLoadFiles() {
        FileChooser chooser = new FileChooser();
        var files = chooser.showOpenMultipleDialog(null);

        if (files != null) {
            for (File file : files) {
                filesList.getItems().add(file.getName());
            }
        }
    }
}
