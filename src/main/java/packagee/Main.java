package packagee;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {
    private static final int BUTTON_PADDING = 4;
    private Game gra;
    private Button[][] buttonBoard;
    private TextField rowInp;
    private TextField colInp;
    private TextField bombInp;
    private Label bombAmount;
    private Label markedAmount;

    private Map<String, Image> icons = new HashMap<>();


    @Override
    public void start(Stage primaryStage) {

    }

    public static void main(String[] args) {

        launch(args);
    }
}
