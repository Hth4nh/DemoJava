package chuong2;
import java.util.Scanner;

public class Ptb2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap gia tri a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap gia tri b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap gia tri b: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double delta = b*b - 4*a*c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / 2 / a;
                double x2 = (-b - Math.sqrt(delta)) / 2 / a;

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if (delta == 0) {
                System.out.println("x1 = x2 = " + (-b / 2 / a));
            }
            else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
        else if (b != 0) {
            System.out.println("x = " + (-c / b));
        }
        else if (c != 0) {
            System.out.println("Phuong trinh vo nghiem.");
        }
        else {
            System.out.println("Phuong trinh vo so nghiem.");
        }
        
        sc.close();
    }
}
