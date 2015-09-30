import java.util.Scanner;

public class Calculator_operand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    	System.out.println("Please enter 2 numbers");
 
        int XX = input.nextInt();
        int XY = input.nextInt();
        
        System.out.println("Would you like to:");
        System.out.println("1. Add           2. Subtract");
        System.out.println("3. Multiply      4. Divide?");
        int op = input.nextInt();
        
        if (op == 1){
        int Answer = XX + XY;
        System.out.println("The numbers you are adding: " + XX + " and " + XY);
        System.out.println("The sum is " + Answer);
        }
        
        if (op == 2){
        int Answer = XX - XY;
        System.out.println("The numbers you are subtracting: " + XX + " and " + XY);
        System.out.println("The difference equals " + Answer);
        }
        
        if (op == 3){
        int Answer = XX * XY;
        System.out.println("The numbers you are multiplying: " + XX + " and " + XY);
        System.out.println("The product equals " + Answer);
        }
        
        if (op == 4){
        int Answer = XX / XY;
        System.out.println("The numbers you are dividing: " + XX + " and " + XY);
        System.out.println("The quotient equals " + Answer);
        
        input.close();
        }
     }
}