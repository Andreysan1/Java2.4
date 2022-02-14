package com.example.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller {

    @FXML
    public javafx.scene.control.TextArea textArea;
    @FXML
    public javafx.scene.control.TextField textField;

    @FXML
    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}