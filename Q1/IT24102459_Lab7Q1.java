import java.util.Scanner;

public class IT24102459Lab7Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average: " + average);

            if (average >= 75) {
                System.out.println("Grade: Distinction");
            } else if (average >= 50) {
                System.out.println("Grade: Credit");
            } else {
                System.out.println("Grade: Fail");
            }
            System.out.println();  
        }

    }
}
