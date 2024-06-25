package com.example.practika;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Не надо было на меня нажимать");
    }
    @FXML
    protected void onClick() {
        welcomeText.setText("Зря");
    }
    @FXML
    protected void onClick2() {
        welcomeText.setText("Ты нажал на кнопку на клавиатуре");
    }
}