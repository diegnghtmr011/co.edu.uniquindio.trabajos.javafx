module co.edu.uniquindio.trabajos.javafx.trabajosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.trabajos.javafx.trabajosjavafx to javafx.fxml;
    exports co.edu.uniquindio.trabajos.javafx.trabajosjavafx;
}