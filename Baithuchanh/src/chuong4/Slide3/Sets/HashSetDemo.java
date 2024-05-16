package chuong4.Slide3.Sets;

import java.util.HashSet;
import java.util.Scanner;

import chuong4.Slide3.Student;

@SuppressWarnings("resource")

public class HashSetDemo {
    private HashSet<Student> list = new HashSet<Student>();

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Student student = new Student();

            System.out.println("\nNhap thong tin hoc sinh thu " + (i + 1) + ": ");
            student.nhapThongTin();

            list.add(student);
        }

        System.out.println();
    }

    public void inThongTin() {
        System.out.println("Thong tin cua tat ca cac hoc sinh: ");

        int count = 0;

        for (Student student: this.list) {
            System.out.println("\nHoc sinh thu " + ++count + ": ");
            student.inThongTin();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();
        demo.nhapThongTin();
        demo.inThongTin();
    }
}
