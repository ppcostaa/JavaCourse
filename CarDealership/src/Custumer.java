public class Custumer {
    private String name;
    private int age;
    private double cashOnHand;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getCashOnHand() {
        return cashOnHand;
    }
    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void custGreeting(){
        System.out.println("Hi. I'm " + name);
        System.out.println("I'm " + age + " years old.");
        System.out.println("I have " + cashOnHand + " cash on hand now.");
    }

    public void purchaseCarVehicle(Vehicle vehicle, Employee emp, boolean finance){
        emp.handleCostumer(this, vehicle, finance);
    }
}
