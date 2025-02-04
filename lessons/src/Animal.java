
public class Animal {
        String name;
        String type;
        int age;
        String color;
        String noise;
        boolean isDomestic;

        public Animal(String name, String type, int age, String color, String noise, boolean isDomestic){
            super();
            this.name = name;
            this.age = age;
            this.type = type;
            this.color = color;
            this.noise = noise;
            this.isDomestic = isDomestic;
        };
        public void info(){
            System.out.println("Look! This is " + name);
            System.out.println("It is a " + type);
            System.out.println("It is " + age + " years old");
            System.out.println("It has a " + color + " color");
            if(isDomestic){
                System.out.println("It is a domestic animal :o");
            } else {
                System.out.println("It is not a domestic animal :(");
            }
        }
        public void speak(){
            System.out.println("Listen, its making a noise..." + noise);
        }
        public void eat(){
            System.out.println("Eating...");
        }
        public void sleep(){
            System.out.println("Sleeping...");
        }
        public void walk(){
            System.out.println("Walking...");
        }

    public void move() {

    }

}