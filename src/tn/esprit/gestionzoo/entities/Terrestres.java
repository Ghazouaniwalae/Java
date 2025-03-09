package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.Food;
import tn.esprit.gestionzoo.main.InvalidAgeException;
import tn.esprit.gestionzoo.main.Omnivore;

public class Terrestres extends Animal implements Omnivore<Food> {
    private int nblegs;

    public Terrestres(String family, String name, int age, boolean isMammal, int nblegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nblegs = nblegs;
    }
    @Override
    public String toString(){
        return super.toString() + "\nNblegs: " + nblegs;
    }

    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both meat and plants.");
        } else {
            System.out.println(getName() + " wants both food types.");
        }
    }
}
