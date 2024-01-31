import java.util.Scanner;

public class Ngay_24_1_trang47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.print("Nhap so tiep theo: ");
            sum += sc.nextInt();
        }
        while (sum < 100);

        System.out.println("Tong cua cac so da nhap: " + sum);

        sc.close();
    }
}
