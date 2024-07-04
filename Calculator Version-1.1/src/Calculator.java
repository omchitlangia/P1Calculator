import java.util.Scanner;

import java.lang.Math;


public class Calculator {
    
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);

     System.out.println(" ");

      System.out.println("Calculator");
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
      


      double result = 0;

      System.out.println("  ");
      System.out.println("Initialisation: " + result);

      System.out.print("Enter a number: ");
        double number = input.nextDouble();  

        result = number;

        char op;


     while(true)
     {
        System.out.println("  ");

        System.out.print("Enter an operator: ");
        op = input.next().trim().charAt(0);

        if(op == '=') 

        {System.out.println("Result = " + result);
        System.out.print("Enter an operator: ");
        op = input.next().trim().charAt(0); }

        
            
        if(op == 'e' || op == 'E') 

        {result = 0; System.out.println("Result = " + result);
        op = '+';}


        if (op == 'x' || op =='X') {break;}


        if (op == '+' || op == '-' || op == '*' || op == '%' || op == '^' || op == '/' ) 

        {

        System.out.println("  ");

       System.out.print("Enter a number: ");
       number = input.nextDouble();  


        if(op == '+'){result = result + number; System.out.println("Result = " + result); }
        
        else if(op == '-'){result = result - number; System.out.println("Result = " + result); }

        else if(op == '*'){result = result*number; System.out.println("Result = " + result); }

        else if(op == '/'){result = result/number; System.out.println("Result = " + result); }

        else if(op == '%'){result = result % number; System.out.println("Result = " + result); }

        else {result = Math.pow(result, number); System.out.println("Result = " + result); }
        
       }
      

        
       else if ( op == 's'|| op == 'S'|| op == 'c' || op == 'C' || op == 't' || op == 'T' )
       
       {
        
        System.out.println("Previous results cleared.");

        System.out.println("  ");

        System.out.print("Enter a new number for the trigonometric function:  ");
        number = input.nextDouble();  


        if (op == 's' || op == 'S'){result = Math.sin(number); System.out.println("Result = " + result); }

        else if(op == 'c' || op == 'C'){result = Math.cos(number); System.out.println("Result = " + result);}

        else {result = Math.tan(number); System.out.println("Result = " + result);}
      
        } 



        else if(op == 'r' || op == 'R' )
        
        {
          
          
        result = Math.sqrt(result); 
        System.out.println("Result = " + result);


      
        }

        else if(op == 'o' || op == 'O'|| op == 'f' || op == 'F' || op == 'a' || op == 'A')


        { if(op == 'o' || op == 'O'){ result = Math.round(result);
         System.out.println("Result = " + result);} 


         else if(op == 'f' || op == 'F'){result = Math.floor(result);
        System.out.println("Result = " + result);} 


        else { result = Math.abs(result);
         System.out.println("Result = " + result);}
      
        } 


        else if(op == 'l' || op == 'L')
        
        { 

         System.out.println(" ");
         System.out.println("'1' : Base 10 ");
         System.out.println("'2' : Base e");
         System.out.println(" ");
         System.out.print("Enter '1' or '2' : ");
         
         
         byte logbase = input.nextByte();

         
         if (logbase == 1)


       { 
         result = Math.log10(result);
         System.out.println("Result = " + result);

         }

         else if(logbase == 2)

       {

         result = Math.log(result);
         System.out.println("Result = " + result);

         }


       }


         else if(op == 'i' || op == 'I')
      

         
         {

            
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



        else{ System.out.println("Invalid Operation"); }

     
      }
   

   input.close(); 


   } 
    
}
