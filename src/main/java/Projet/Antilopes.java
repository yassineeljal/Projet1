package Projet;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Antilopes extends Animaux {
    public Antilopes() {
        super(0, 10,"Herbivores");
    }
    public void start(Stage antilopes) {
        TextField nbLions = new TextField();
        nbLions.setId("nbLion");

        for(i = 0; i < nbLions; i++){
            Lion lion = new Lion();
        }
    }
}
