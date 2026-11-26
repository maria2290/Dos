package com.leidy.agendap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClienteController {
    @javafx.fxml.FXML
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
