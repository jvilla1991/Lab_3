import java.util.Scanner;

// Make a display table of different powers using a number entered by the user

public class Main {

    public static int printUserNumber(int x)
    {
        return x;
    }

    public static void main(String[] args)
    {
        long i = 0;
        long userInt = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        userInt = scnr.nextInt();

        System.out.println("Number   " + "   Squared   " + "   Cubed");
        for (i = 1; i <= userInt; ++i)
        {
            System.out.println((i) + "           " + (i * i) + "            " + (i * i * i));
        }
        



    }
}
