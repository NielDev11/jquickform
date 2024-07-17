package controlador;

import java.net.URL;
import java.util.ResourceBundle;

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
    private ComboBox<?> cboxTipo;

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

    }

}
