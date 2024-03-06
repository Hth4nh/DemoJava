package chuong2;
import java.util.Scanner;

public class Slide74 {
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

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        System.out.println("Tong cac so chan trong mang: " + sum);

        sc.close();
    }
}
