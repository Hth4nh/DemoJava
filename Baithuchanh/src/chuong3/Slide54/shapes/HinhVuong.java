package chuong3.Slide54.shapes;

import java.util.Scanner;

@SuppressWarnings("resource")

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hinh Vuong";
    }

    public void nhapCanh() {
        System.out.print("Nhap canh: ");
		Scanner sc = new Scanner(System.in);
		dai = rong = sc.nextFloat();
    }
}
