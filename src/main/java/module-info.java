module com.example.teste1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.teste1 to javafx.fxml;
    exports com.example.teste1;
}