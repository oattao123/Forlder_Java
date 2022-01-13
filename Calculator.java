import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    double answer = 0;
    char operator;

    Scanner scanObject = new Scanner(System.in);

    System.out.print("Enter first number: ");
    num1 = scanObject.nextInt();
    System.out.print("Enter second number: ");
    num2 = scanObject.nextInt();
    System.out.print("What operation?");
    operator = scanObject.next().charAt(0);

    switch (operator) {
      case '+' : answer = num1 + num2;
       break;
      case '-' : answer = num1 - num2;
       break;
      case '*' : answer = num1 * num2;
       break;
      case '/' : answer = num1 / num2;
       break;
      case '_' : answer = 0;
       break;
    }
    System.out.println(num1+ " "+operator+" "+num2+" = "+answer);

    }
  }
  