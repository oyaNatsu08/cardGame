module com.example.cardgame2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.cardgame to javafx.fxml;
    exports com.example.cardgame;
}