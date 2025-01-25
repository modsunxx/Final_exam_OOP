import java.util.Scanner;

public class FX_OOP_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[6];
        int sum =array[0];

        for(int i = 0;i<array.length;i++){
            System.out.print("Attack "+(i+1)+": ");
            array[i] = sc.nextInt();
            sum += array[i];
        }
        int finalatk = sum/2;
        // System.out.println(sum);
        if (finalatk<100) {
            System.out.println("Kuppa is not dead");
        }
        else{
            System.out.println("Kuppa is dead");
        }
    }
}
