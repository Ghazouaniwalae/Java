public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    Animal(String family, String name, int age, boolean isMammal) {
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
}
