import java.util.Scanner;

public class c0104 {

    public static void main(String[] args) {
        // Creat a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a fahrenheit
        System.out.print("Enter a degree in Fahrenheit ");
        double fahrenheit = input.nextDouble();

        //Convert fahrenheit to  Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        //Display results
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
}