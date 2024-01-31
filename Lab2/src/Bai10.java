import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;

        do {
            System.out.print("Nhap chuoi: ");
            s = sc.nextLine();
        } while (s.length() > 80);

        System.out.print("Nhap ky tu bat ky: ");
        char c = sc.next().charAt(0);

        int index = s.indexOf(c);
        int count = 0;

        while (index >= 0) {
            ++count;
            index = s.indexOf(c, index + 1);
        }

        System.out.println("So lan xuat hien cua " + c + " : " + count);

        sc.close();
    }
}
