import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= '9') {
                ++digitCount;
            }
            else if (c <= 'Z') {
                ++upperCount;
            }
            else {
                ++lowerCount;
            }
        }

        System.out.println("So luong ky tu thuong: " + lowerCount);
        System.out.println("So luong ky tu in hoa: " + upperCount);
        System.out.println("So luong ky tu so: " + digitCount);

        sc.close();
    }
}
