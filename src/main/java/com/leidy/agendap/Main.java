package com.leidy.agendap;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage escenario) {

        Label titulo = new Label("AGENDA P");
        Label subtitulo = new Label("Sistema de gestión de citas");

        Button botonClientes = new Button("Gestionar clientes");
        Button botonServicios = new Button("Gestionar servicios");
        Button botonCitas = new Button("Gestionar citas");

        VBox contenedor = new VBox(15);

        contenedor.getChildren().addAll(
                titulo,
                subtitulo,
                botonClientes,
                botonServicios,
                botonCitas
        );

        Scene escena = new Scene(contenedor, 500, 400);

        escenario.setTitle("AgendaP");
        escenario.setScene(escena);
        escenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}