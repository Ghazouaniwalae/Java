package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.InvalidAgeException;

public class Terrestres extends Animal {
    private int nblegs;

    public Terrestres(String family, String name, int age, boolean isMammal, int nblegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nblegs = nblegs;
    }
    @Override
    public String toString(){
        return super.toString() + "\nNblegs: " + nblegs;
    }
}
