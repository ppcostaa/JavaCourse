
public class CarDealership {
    public static void main(String[] args) {
        Custumer cust1 = new Custumer();
        cust1.setName("Sae Itoshi");
        cust1.setAge(19);
        cust1.setCashOnHand(100000);
        Employee emp1 = new Employee();
        emp1.setName("Blue Lock Man");
        emp1.setAge(22);
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setType("HB20");
        vehicle1.setPrice(90000);
        vehicle1.setColor("Black");

        cust1.custGreeting();
        emp1.empGreeting();
        System.out.println("I'd like to buy the  " + vehicle1.getType() + ", color " + vehicle1.getColor());

        cust1.purchaseCarVehicle(vehicle1, emp1, false);


    }

}