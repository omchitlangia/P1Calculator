import java.util.Scanner;

import java.lang.Math;

public class CalculatorV1_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("CalculatorV1");
        System.out.println(" ");

        System.out.println("Instructions:  ( Press 'i' or 'I' to print instructions again.)");

        System.out.println(" ");

        System.out.println("1.General operators like +,-,*,/,% can be used.");
        System.out.println("2.To clear the results, enter 'e' or 'E'.");
        System.out.println("3.To stop the program, enter 'x' or 'X'.");
        System.out.println("4.To print the result, enter '='");
        System.out.println("5.Exponential functions,'^' for power and 'r' or 'R' for square root.");
        System.out.println("6.Trigonometric functions, 's' or 'S' for sin , 'c' or 'C' for cos and 't' or 'T' for tan.");
        System.out.println("7.Use 'a' or 'A' to get the absolute value.");
        System.out.println("8.Use 'f' or 'F' to get the closest integer towards negative infinity.");
        System.out.println("9.Use 'o' or 'O' to round off.");
        System.out.println("10.Logarithmic function, enter 'l' or 'L' to use ");


        System.out.println("  ");
        System.out.println("Initialisation: " + "0.00");

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double result = number;

        char op;

        while(true) {
            System.out.println("  ");

            System.out.print("Enter an operator: ");
            op = input.next().trim().charAt(0);


            if(op == 'x' || op == 'X'){break;}
            

            if(op == 'e' || op == 'E')

             {result = 0; System.out.println("Result = " + result);
                op = '+';}


            switch(op) {

                case '+', '-', '*', '%', '^', '/' -> {
                    System.out.println("  ");

                    System.out.print("Enter a number: ");
                    number = input.nextDouble();

                    switch (op) {
                        case '+' -> {
                            result = result + number;
                            System.out.println("Result = " + result);
                        }
                        case '-' -> {
                            result = result - number;
                            System.out.println("Result = " + result);
                        }
                        case '*' -> {
                            result = result * number;
                            System.out.println("Result = " + result);
                        }
                        case '/' -> {
                            result = result / number;
                            System.out.println("Result = " + result);
                        }
                        case '%' -> {
                            result = result % number;
                            System.out.println("Result = " + result);
                        }
                        case '^' -> {
                            result = Math.pow(result, number);
                            System.out.println("Result = " + result);
                        }
                    }
                }

                case 's', 'S', 'c', 'C', 't', 'T' -> {
                    System.out.println("Previous results cleared.");

                    System.out.println("  ");

                    System.out.print("Enter a new number for the trigonometric function:  ");
                    number = input.nextDouble();

                    switch (op) {
                        case 's', 'S' -> {
                            result = Math.sin(number);
                            System.out.println("Result = " + result);
                        }
                        case 'c', 'C' -> {
                            result = Math.cos(number);
                            System.out.println("Result = " + result);
                        }
                        case 't', 'T' -> {
                            result = Math.tan(number);
                            System.out.println("Result = " + result);
                        }
                    }
                }

                case 'r', 'R' -> {
                    result = Math.sqrt(result);
                    System.out.println("Result = " + result);
                }

                case 'o', 'O', 'f', 'F', 'a', 'A' -> {

                    switch (op) {
                        case 'o', 'O' -> {
                            result = Math.round(result);
                            System.out.println("Result = " + result);
                        }

                        case 'f', 'F' -> {
                            result = Math.floor(result);
                            System.out.println("Result = " + result);
                        }

                        case 'a', 'A' -> {
                            result = Math.abs(result);
                            System.out.println("Result = " + result);
                        }
                    }
                }

                case 'l', 'L' -> {
                    System.out.println(" ");
                    System.out.println("'1' : Base 10 ");
                    System.out.println("'2' : Base e");
                    System.out.println(" ");
                    System.out.print("Enter '1' or '2' : ");


                    byte logbase = input.nextByte();

                    switch (logbase) {
                        case 1 -> {
                            result = Math.log10(result);
                            System.out.println("Result = " + result);
                        }

                        case 2 -> {
                            result = Math.log(result);
                            System.out.println("Result = " + result);
                        }
                    }

                }


                case 'i', 'I' -> {
                    System.out.println(" ");

                    System.out.println("Instructions:  ( Press 'i' or 'I' to print instructions again.)");

                    System.out.println(" ");

                    System.out.println("1.General operators like +,-,*,/,% can be used.");
                    System.out.println("2.To clear the results, enter 'e' or 'E'.");
                    System.out.println("3.To stop the program, enter 'x' or 'X'.");
                    System.out.println("4.To print the result, enter '='");
                    System.out.println("5.Exponential functions,'^' for power and 'r' or 'R' for square root.");
                    System.out.println("6.Trigonometric functions, 's' or 'S' for sin , 'c' or 'C' for cos and 't' or 'T' for tan.");
                    System.out.println("7.Use 'a' or 'A' to get the absolute value.");
                    System.out.println("8.Use 'f' or 'F' to get the closest integer towards negative infinity.");
                    System.out.println("9.Use 'o' or 'O' to round off.");
                    System.out.println("10.Logarithmic function, enter 'l' or 'L' to use ");
                }

                case '='->
                    System.out.println("Result = " + result);

                default -> System.out.println("Invalid Operation");

            }
        }
    }
}
