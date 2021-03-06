/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserent;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HouseRent extends Application {
    
    static Stage stage;
    static AnchorPane rootpane = new AnchorPane();
    
    static void load(String link) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HouseRent.class.getResource(link));
        rootpane =loader.load();
        Scene scene = new Scene(rootpane);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        load("Main.fxml");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
