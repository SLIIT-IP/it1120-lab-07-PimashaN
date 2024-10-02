import java.util.Scanner;

public class IT24102459Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * 0.05;  
                double amountToPay = totalBill - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            }
              else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } 
              else {
                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println();  
        }
        
    }
}
