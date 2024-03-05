module co.edu.uniquindio.moto.motoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.moto.motoapp to javafx.fxml;
    exports co.edu.uniquindio.moto.motoapp;


  //  opens co.edu.uniquindio.moto.motoapp.model;


    opens co.edu.uniquindio.moto.motoapp.controller;
    exports co.edu.uniquindio.moto.motoapp.controller;
}