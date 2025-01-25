import java.util.Scanner;

public class FX_OOP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input mario first attack : ");
        double a = sc.nextDouble();
        System.out.print("Input mario second attack : ");
        double b = sc.nextDouble();

        if (a+b>6) {
            System.out.println("Kuppa is dead");
        }
        else{
            System.out.println("kuppa is not dead");
        }
    }
}
