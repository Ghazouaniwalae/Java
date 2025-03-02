package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal {
    private int nblegs;

    public Terrestres(String family, String name, int age, boolean isMammal, int nblegs) {
        super(family, name, age, isMammal);
        this.nblegs = nblegs;
    }
    @Override
    public String toString(){
        return super.toString() + "\nNblegs: " + nblegs;
    }
}
