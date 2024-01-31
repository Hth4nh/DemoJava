import java.util.Scanner;

public class Bai8 {
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

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        System.out.println("Trung binh cong: " + sum / n);

        sc.close();
    }
}
