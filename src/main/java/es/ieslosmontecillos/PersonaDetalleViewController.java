package es.ieslosmontecillos;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class PersonaDetalleViewController {
    @javafx.fxml.FXML
    private DatePicker datePickerFechaNacimiento;
    @javafx.fxml.FXML
    private TextField textFieldNombre;
    @javafx.fxml.FXML
    private TextField textFieldApellidos;
    @javafx.fxml.FXML
    private TextField textFieldTelefono;
    @javafx.fxml.FXML
    private TextField textFieldEmail;
    @javafx.fxml.FXML
    private TextField textFieldNumHijos;
    @javafx.fxml.FXML
    private TextField textFieldSalario;
    @javafx.fxml.FXML
    private CheckBox checkBoxJubilado;
    @javafx.fxml.FXML
    private ComboBox<Provincia> comboBoxProvincia;
    @javafx.fxml.FXML
    private RadioButton radioButtonSoltero;
    @javafx.fxml.FXML
    private RadioButton radioButtonCasado;
    @javafx.fxml.FXML
    private RadioButton radioButtonViudo;
    @javafx.fxml.FXML
    private ImageView imageViewFoto;

    private Pane rootAgendaView;
    @javafx.fxml.FXML
    private Pane rootPersonaDetalleView;


    private TableView tableViewPrevio;
    private Persona persona;
    private DataUtil dataUtil;
    private boolean nuevaPersona;

    //Métodos

    public void setTableViewPrevio(TableView tableViewPrevio){
        this.tableViewPrevio=tableViewPrevio;
    }

    public void setPersona(Persona persona, Boolean nuevaPersona){
        if (!nuevaPersona){
            this.persona= persona;
        } else {
            this.persona = new Persona();
        }
        this.nuevaPersona=nuevaPersona;
    }

    public void onActionButtonGuardar(ActionEvent actionEvent) {

        StackPane rootMain =
                (StackPane) rootPersonaDetalleView.getScene().getRoot();
        rootMain.getChildren().remove(rootPersonaDetalleView);
        rootAgendaView.setVisible(true);
    }

    public void onActionButtonCancelar(ActionEvent actionEvent) {
        StackPane rootMain =
                (StackPane) rootPersonaDetalleView.getScene().getRoot();
        rootMain.getChildren().remove(rootPersonaDetalleView);
        rootAgendaView.setVisible(true);

    }

    public void setRootAgendaView(Pane rootAgendaView){
        this.rootAgendaView = rootAgendaView;
    }
}
