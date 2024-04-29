package com.example.projet1;

import Projet.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    @FXML
    private TextField lion;

    @FXML
    private TextField antilope;



    @FXML
    private TextField herbe;

    @FXML
    private Button Envoyer;


    Herbe herbe1 = new Herbe();
    Organisateur org = new Organisateur();

    @FXML
    protected void onClickEnvoyer() {
        int nbrLion = Integer.parseInt(lion.getText());
        int nbrAntilope = Integer.parseInt(antilope.getText());
        int nbrHerbe = Integer.parseInt(herbe.getText());

        herbe1.setMetreCarre(nbrHerbe);

        for (int i = 0; i < nbrLion; i++) {
            Lion lion = new Lion();
            org.getAnimaux().add(lion);
        }
        for (int i = 0; i < nbrAntilope; i++) {
            Antilopes antilope = new Antilopes();
            org.getAnimaux().add(antilope);
        }
    }
}