package chuong3.Slide54.shapes;

import java.util.Scanner;

@SuppressWarnings("resource")

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
		System.out.print("Nhap ban kinh: ");
		Scanner sc = new Scanner(System.in);
		banKinh = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		chuVi = banKinh * 2 * PI;
	}
	
	public void tinhDienTich() {
		dienTich = banKinh * banKinh * PI;
	}
}
