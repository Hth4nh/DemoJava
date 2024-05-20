package chuong4.Slide3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import chuong4.Slide3.Student;

@SuppressWarnings("resource")

public class ArrayListDemo {
    private ArrayList<Student> list = new ArrayList<Student>();

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

        for (int i = 0; i < this.list.size(); i++) {
            System.out.println("\nHoc sinh thu " + (i + 1) + ": ");
            this.list.get(i).inThongTin();
        }

        System.out.println();
    }

    public void suaThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu tu cua hoc sinh can sua thong tin: ");
        int pos = sc.nextInt();

        this.list.get(pos).nhapThongTin();

        System.out.println();
    }

    public void xoaThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu tu cua hoc sinh can xoa thong tin: ");
        int pos = sc.nextInt();

        this.list.remove(pos);

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.nhapThongTin();
        demo.inThongTin();

        demo.suaThongTin();
        demo.inThongTin();

        demo.xoaThongTin();
        demo.inThongTin();
    }
}
