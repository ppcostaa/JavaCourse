public class Bird extends Animal {
    public Bird(String name, String type, int age, String color, String noise, boolean isDomestic) {
        super(name, type, age, color, noise, isDomestic);
    }
    public void move(){
      System.out.println("Ohh, it's flopping its wings!");
    };
}
