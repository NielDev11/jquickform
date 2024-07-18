package controlador;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MainControlador implements Initializable {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnenviarCorreo;

    @FXML
    private ComboBox<String> cboxTipo;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtcontrasena_correo;

    @FXML
    private TextField txtcontrasena_usuario;

    @FXML
    private TextField txtcorreo;

    @FXML
    private TextField txtnumtelefono;

    @FXML
    void selectionHandler(ActionEvent event) {
        String itemSeleccionado = cboxTipo.getSelectionModel().getSelectedItem().toString();
        if (itemSeleccionado.equals("Q10")) {
            txtcorreo.setDisable(true);
            txtcontrasena_correo.setDisable(true);
            txtcontrasena_usuario.setDisable(false);
            txtUsuario.setDisable(false);
            txtnumtelefono.setDisable(true);
        } else if (itemSeleccionado.equals("Correo")) {
            txtcorreo.setDisable(false);
            txtcontrasena_correo.setDisable(false);
            txtcontrasena_usuario.setDisable(true);
            txtUsuario.setDisable(true);
            txtnumtelefono.setDisable(true);
        } else if (itemSeleccionado.equals("Ambos correo y Q10")) {
            txtcorreo.setDisable(false);
            txtcontrasena_correo.setDisable(false);
            txtcontrasena_usuario.setDisable(false);
            txtUsuario.setDisable(false);
            txtnumtelefono.setDisable(true);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtCodigo.setText("123456789");
        txtNombre.setText("Nombre");
        txtUsuario.setDisable(true);
        txtcontrasena_correo.setDisable(true);
        txtcontrasena_usuario.setDisable(true);
        txtcorreo.setDisable(true);
        txtnumtelefono.setDisable(true);
        List<String> lista = Arrays.asList("Q10", "Correo", "Ambos correo y Q10");

        for (String item : lista) 
        {
            cboxTipo.getItems().add(item);
        }


    }
    




}
