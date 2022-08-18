
package proyecto_calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculadoraViewController {
    Proyecto_Calculadora aplicacion;
    
    @FXML
    private Button buttonIgual;

    @FXML
    private Button buttonLimpiar;

    @FXML
    private Label labelResultado;

    @FXML
    void igualAction(ActionEvent event) {

    }

    @FXML
    void limpiarAction(ActionEvent event) {

    }

    @FXML
    void presionButton(ActionEvent event) {

    }

    public void setAplicacion(Proyecto_Calculadora aplicacion){
        this.aplicacion = aplicacion;
    }
    
}
