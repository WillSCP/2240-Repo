package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class StartBadLogin {
    private static Stage primaryStage = new Stage();
    void start() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BadLogin.fxml"));
        primaryStage.setTitle("Bad Login");
        primaryStage.setScene(new Scene(root, 250, 150));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    static void killProcess(){
        primaryStage.close();
    }
}