import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Find HCF using Euclidean algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;

        // LCM = (a * b) / HCF
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
