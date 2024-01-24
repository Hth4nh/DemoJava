import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay: ");
        int day = sc.nextInt();

        switch (day) {
            case 0:
                System.out.println("Chu nhat.");
                break;

            case 1:
                System.out.println("Thu 2.");
                break;

            case 2:
                System.out.println("Thu 3.");
                break;

            case 3:
                System.out.println("Thu 4.");
                break;

            case 4:
                System.out.println("Thu 5.");
                break;

            case 5:
                System.out.println("Thu 6.");
                break;

            case 6:
                System.out.println("Thu 7.");
                break;

            default:
                System.out.println("So ngay trong tuan sai.");   
                break;
        }

        sc.close();
    }
}
