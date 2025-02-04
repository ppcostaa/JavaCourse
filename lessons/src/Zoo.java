public class Zoo {
    public static void main(String[] args) {
        Animal Cat = new Animal("Pindamonhangaba", "Cat", 2, "black", "meow", true);
        Animal Dog = new Animal("Rebimboca", "Dog", 3, "white", "woof", true);
        Animal Lion = new Animal("Parafuseta", "Lion", 4, "golden", "roar", false);

        Lion.info();
        Lion.speak();

        Cat.info();
        Cat.speak();
        Cat.sleep();

        Dog.info();
        Dog.speak();
        Dog.walk();

    }
}
