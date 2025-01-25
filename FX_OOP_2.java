import java.util.Scanner;

public class FX_OOP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();

        if (n % 2 == 1) {
            System.out.println("enter num again");
        } else {
            for (int i = 2; i <= n; i += 2) {
                System.out.println(i);
            }
        }
    }
}
