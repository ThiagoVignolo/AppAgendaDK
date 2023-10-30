package es.ieslosmontecillos;


import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AgendaViewController implements Initializable {


    private DataUtil dataUtil;
    private ObservableList<Provincia> olProvincias =
            FXCollections.observableArrayList();
    private ObservableList<Persona> olPersonas =
            FXCollections.observableArrayList();
    @FXML
    private TableView<Persona> tableViewAgenda;
    @FXML
    private TableColumn<Persona,String> columnNombre;
    @FXML
    private TableColumn<Persona,String> columnApellido;
    @FXML
    private TableColumn<Persona,String> columnEmail;
    @FXML
    private TableColumn<Persona,String> columnProvincia;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnApellido.setCellValueFactory(new
                PropertyValueFactory<>("apellidos"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnProvincia.setCellValueFactory(
                cellData->{
                    SimpleStringProperty property=new SimpleStringProperty();
                    if (cellData.getValue().getProvincia().getId() != 0){
                        property.setValue(cellData.getValue().getProvincia().getNombre());
                    }
                    return property;
                });
    }

    public void setDataUtil(DataUtil dataUtil) {
        this.dataUtil = dataUtil;
    }

    public void setOlProvincias(ObservableList<Provincia> olProvincias) {
        this.olProvincias = olProvincias;
    }

    public void setOlPersonas(ObservableList<Persona> olPersonas) {
        this.olPersonas = olPersonas;
    }



    public void cargarTodasPersonas() {
        tableViewAgenda.setItems(FXCollections.observableArrayList(olPersonas));
    }

}