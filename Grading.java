import java.util.Scanner;
public class Grading {
    public static void main(String[] args){

        int grad = 0;    
        Scanner point = new Scanner(System.in);
        System.out.print("Enter point: "); 
        grad = point.nextInt();
        if (grad >= 80 && grad <= 100) {
            System.out.print("4");
        }
        else if (grad >= 70) {
            System.out.print("3");
        }
        else if (grad >= 60) {
            System.out.print("2");
        }
        else if (grad >= 50) {
            System.out.print("1");
        }
        else if (grad < 50 && grad >= 0) {
            System.out.print("0");
        }
        else {
            System.out.print("Enter point:");
            grad = point.nextInt();
        }

    }
}