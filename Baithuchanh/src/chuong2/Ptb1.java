package chuong2;
import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap gia tri a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap gia tri b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.println("x = " + (-b / a));
        }
        
        sc.close();
    }
}
