import java.util.Scanner;

public class calculuter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the operator(+ - * /): ");
        String c = scanner.next();
        
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (c.equals("+")) {
            System.out.println(number1 + " +" + " " + number2 + " = " + (number1 + number2));
        } else if (c.equals("-")) {
            System.out.println(number1 + " -" +  " " + number2 + " = " + (number1 - number2));
        } else if (c.equals("*")) {
            System.out.println(number1 + " *" +  " " + number2 + " = " + (number1 * number2));
        } else if (c.equals("/")) {
            System.out.println(number1 + " /" +  " " + number2 + " = " + (number1 / number2));
        } else {
            System.out.println("Invalid input");
        }
    }
}