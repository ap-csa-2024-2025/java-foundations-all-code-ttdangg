import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();

        while (number != -1) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }

        System.out.println("The sum is " + sum);

        do{
            System.out.println("Enter a number (-1 to quit): ");
            number = console.nextInt();
            // if (number != -1)
            // {
                sum = sum + number;
            // }
        }while(number != -1);
        sum++;
        System.out.println("The sum is " + sum);
    }
}
