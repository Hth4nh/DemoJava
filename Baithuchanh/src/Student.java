import java.time.Year;
import java.util.Scanner;

public class Student {
    String name;
    int id;
    int birthYear;
    String address;
    int age;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();

        System.out.print("Nhap ma so sinh vien: ");
        id = sc.nextInt();

        System.out.print("Nhap nam sinh: ");
        birthYear = sc.nextInt();

        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();

        sc.close();
    }

    void tinhTuoi() {
        int currYear = Year.now().getValue();
        age = currYear - birthYear;
    }

    void inThongTin() {
        System.out.println("Ho ten: " + name);
        System.out.println("Ma so sinh vien: " + id);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Dia chi: " + address);
        System.out.println("Tuoi: " + age);
    }

    public static void main(String[] args) {
        Student p = new Student();
        p.nhapThongTin();
        p.tinhTuoi();
        p.inThongTin();
    }
}
