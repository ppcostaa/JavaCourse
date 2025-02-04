public class Zoo {
    public static void main(String[] args) {
        Animal Cat = new Animal("Pindamonhangaba", "Cat", 2, "black", "meow", true);
        Animal Dog = new Animal("Rebimboca", "Dog", 3, "white", "woof", true);
        Animal Lion = new Animal("Parafuseta", "Lion", 4, "golden", "roar", false);
        Swan Swan = new Swan("Balacobaco", "Bird", 5, "blue", "who-hoo", true);
        Penguin Penguin = new Penguin("Catapimbas", "Penguin", 6, "black and white", "squack", false);

        Lion.info();
        Lion.speak();
        Lion.eat();

        Cat.info();
        Cat.speak();
        Cat.sleep();

        Dog.info();
        Dog.speak();
        Dog.walk();
        Dog.move();

        Penguin.info();
        Penguin.speak();
        Penguin.move();

        Swan.info();
        Swan.speak();
        Swan.fly();
        Swan.move();
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
