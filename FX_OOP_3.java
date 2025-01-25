public class FX_OOP_3 {
    public static void main(String[] args) {
        int n = 8;
        int size =11; 
        for (int i = 0; i < size; i++) { 
            for (int j = -1; j < size-1; j++) {
                if (j >= i) {
                    System.out.print((size - 3 +i)%10 + " ");
                } else {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
