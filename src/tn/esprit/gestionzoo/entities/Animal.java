package tn.esprit.gestionzoo.entities;

public class Animal {
    private  String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age<0){
            System.out.println("Invalid Age");
            return;
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
        return family + "\n" + name + "\n" + age + "\n" + isMammal;
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
