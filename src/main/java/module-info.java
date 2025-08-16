module com.programacion.trivia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.programacion.trivia to javafx.fxml;
    exports com.programacion.trivia;
}