package co.edu.uniquindio.moto.motoapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.moto.motoapp.model.Moto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MotoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarMoto;

    @FXML
    private TextField txtCilindrada;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextArea txtResultado;

    @FXML
    void initialize() {

    }


    @FXML
    void onAgregarMoto(ActionEvent event) {
        agregarMoto();
    }

    private void agregarMoto(){
        Moto moto = new Moto();
        moto.setMarca(txtMarca.getText());
        moto.setModelo(txtModelo.getText());
        moto.setColor(txtColor.getText());
        moto.setCilindrada(Integer.parseInt(txtCilindrada.getText()));

        txtResultado.setText(moto.toString());
    }


}
