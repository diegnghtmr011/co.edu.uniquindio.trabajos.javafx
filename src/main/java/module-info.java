module co.edu.uniquindio.trabajos.javafx.trabajosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.trabajos.javafx.trabajosjavafx to javafx.fxml;
    exports co.edu.uniquindio.trabajos.javafx.trabajosjavafx;

    opens co.edu.uniquindio.trabajos.javafx.trabajosjavafx.controller;
    exports co.edu.uniquindio.trabajos.javafx.trabajosjavafx.controller;
    // opens co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;
}