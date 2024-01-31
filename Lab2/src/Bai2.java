import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Day la so chan.");
        } else {
            System.out.println("Day la so le.");
        }

        sc.close();
    }
}
