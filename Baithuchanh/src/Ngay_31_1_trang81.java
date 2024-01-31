import java.util.Scanner;

public class Ngay_31_1_trang81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        do {
            System.out.print("Nhap so cot: ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.print("Nhap so hang: ");
            m = sc.nextInt();
        } while (m <= 0);

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxVal = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
        }

        System.out.println("Gia tri lon nhat trong ma tran: " + maxVal);

        sc.close();
    }
}
