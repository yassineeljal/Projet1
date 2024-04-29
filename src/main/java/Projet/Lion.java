package Projet;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Lion extends Animaux {
    public Lion() {
        super(0,12,"Carnivore");
    }

    public void start(Stage lions) {
        TextField nbLions = new TextField();
        nbLions.setId("nbLion");

        for(i = 0; i < nbLions; i++){
            Lion lion = new Lion();
        }
    }



}
