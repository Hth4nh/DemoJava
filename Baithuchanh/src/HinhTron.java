import java.util.Scanner;

public class HinhTron {
	final float PI = 3.14f;
	float banKinh;
	float chuVi;
	float dienTich;
	
	public void nhapBanKinh() {
		System.out.print("Nhap ban kinh: ");
		Scanner sc = new Scanner(System.in);
		banKinh = sc.nextFloat();
		sc.close();
	}
	
	public void tinhChuVi() {
		chuVi = banKinh * 2 * PI;
	}
	
	public void tinhDienTich() {
		dienTich = banKinh * banKinh * PI;
	}
	
	public void inThongTin() {
		System.out.println("Chu vi: " + chuVi);
		System.out.println("Dien tich: " + dienTich);
	}
	
	public static void main(String[] args) {
		HinhTron ht = new HinhTron();
		ht.nhapBanKinh();
		ht.tinhChuVi();
		ht.tinhDienTich();
		ht.inThongTin();
	}
}





