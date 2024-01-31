import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        } while (n <= 0);

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Mang ban dau: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(']');

        Arrays.sort(nums);

        System.out.print("Mang da sap xep: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(']');

        sc.close();
    }
}
