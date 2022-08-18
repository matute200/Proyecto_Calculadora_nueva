
package Proyecto_Calculadora;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import proyecto_calculadora.CalculadoraViewController;

public class Proyecto_Calculadora {
    private Stage primaryStage;
	public void start(Stage primaryStage) {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Calculadora");
            mostrarVentana();
	}
    public static void main(String[] args) {
        launch(args);
    }

    private void mostrarVentana() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(CalculadoraViewController.class.getResource("CalculadoraView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            CalculadoraViewController calculadoraViewController= loader.getController();
            calculadoraViewController.setAplicacion(this);

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}