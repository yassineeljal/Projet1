package Projet;


public class Antilopes extends Animaux {
    public Antilopes() {
        super(0, 10,"Antilope",false);
    }

    @Override
    public boolean estMangeable() {
        if (estMort()){
            return false;
        }
        return true;
    }
}
