module com.leidy.agendap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.leidy.agendap to javafx.fxml;
    exports com.leidy.agendap;
    exports com.leidy.agendap.controller;
    opens com.leidy.agendap.controller to javafx.fxml;
}