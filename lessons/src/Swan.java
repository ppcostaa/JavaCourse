public class Swan extends Bird implements Fly{
    public Swan(String name, String type, int age, String color, String noise, boolean isDomestic) {
        super(name, type, age, color, noise, isDomestic);
    }
    public void fly() {
        System.out.println("Look! Swan is flying high!");
    }
}
