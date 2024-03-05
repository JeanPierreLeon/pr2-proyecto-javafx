module co.edu.uniquindio.moto.motoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.moto.motoapp to javafx.fxml;
    exports co.edu.uniquindio.moto.motoapp;
}