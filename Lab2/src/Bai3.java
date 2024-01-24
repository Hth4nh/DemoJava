import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int age = 2024 - sc.nextInt();

        if (age < 16) {
            System.out.println("Ban "+ name +" o do tuoi vi thanh nien.");
        }
        else if (age < 18) {
            System.out.println("Ban "+ name +" o do tuoi truong thanh.");
        }
        else {
            System.out.println("Ban "+ name +" da gia.");
        }
        
        sc.close();
    }
}