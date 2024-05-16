package chuong4.Slide3;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Student {
    private String fullName;
    private int age;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        sc.skip("\\R?");
        this.fullName = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
    }

    public void inThongTin() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Tuoi: " + this.age);
    }
}
