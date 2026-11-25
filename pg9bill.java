public class pg9bill {
    public static void main(String[] args) {
        String CustomerName = "Rahul";
        int units = 350;
        double bill = 0;
        double surcharge = 0;
        if (units < 0) {

            System.out.println("Invalid units");
        } else if (units <= 100) {
            bill = units * 2;

        } else if (units <= 200) {
            bill = units * 3;
        } else if (units <= 300) {
            bill = units * 5;
        } else {
            bill = units * 7;
        }
        if (bill > 1000) {

            surcharge = bill * 0.05;
        } else {

            surcharge = 0;
        }
        double totalBill = bill + surcharge;
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + totalBill);
    }
}