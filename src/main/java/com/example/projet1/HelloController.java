package com.example.projet1;

import Projet.Lion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField lion;

    @FXML
    private TextField antilope;

    @FXML
    private TextField herbe;

    @FXML
    private Button Envoyer;

    @FXML
    protected void onClickEnvoyer() {
        int nbrLion = Integer.parseInt(lion.getText());
        int nbrAntilope = Integer.parseInt(antilope.getText());
        int nbrHerbe = Integer.parseInt(herbe.getText());

        for (int i = 0; i < nbrLion; i++) {
            Lion lion = new Lion();
            
        }

    }
}