package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.InvalidAgeException;

public class Animal {
    private  String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        if (age<0){
            throw new InvalidAgeException();

        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    void diplayAnimal() {
        System.out.println("Family : " + family );
        System.out.println("Name : " + name );
        System.out.println("Age : " + age );
    }
    @Override
    public String toString() {
        return "Familly : "+family + "\nName : " + name + "\nAge : " + age + "\nIsMammal : " + isMammal;
    }
    public String getName(){
        return name;
    }
    public String getFamily(){
        return family;
    }
    public int getAge(){
        return age;
    }


}
