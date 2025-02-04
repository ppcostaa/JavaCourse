public class Employee {
    private String name;
    private int age;

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

    public void empGreeting(){
        System.out.println("Oh, good morning. I'm " + name);
        System.out.println("I'm " + age + " years old. I'll be the one in charge for you today.");
    }

    public void runCreditHistory(Custumer cust, Vehicle vehicle){
        double doubleAmount = vehicle.getPrice() * 2;
        if (cust.getCashOnHand() >= doubleAmount){
            System.out.println("You can finance it.");
        } else {
            System.out.println("I'm sorry, but you can't finance it.");
        }
    }

    public void handleCostumer(Custumer cust, Vehicle vehicle, boolean finance) {
        if (finance) {
            runCreditHistory(cust, vehicle);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()){
            System.out.println("You can buy it. Congrats!");
        } else{
            System.out.println("I'm sorry, but you don't have enough money to buy it. Come back another time.");
        }
    }



}
