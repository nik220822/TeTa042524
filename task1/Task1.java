import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте массив:");
        int n = scanner.nextInt();
        System.out.println("Задайте интервал:");
        int m = scanner.nextInt();
        System.out.println("Путь: " + findTheWay(n, m));
    }

    public static String findTheWay(int n, int m) {
        int[] circl = new int[n];
        for (int i = 0; i < n; i++) circl[i] = i + 1;
        StringBuilder way = new StringBuilder();
        int i = m - 1;
        do {
            if (i + m > n) {
                way.append(circl[i]);
                i = i + m - n - 1;
            }
            if (circl[i] == 1) break;
            way.append(circl[i]);
            i = i + m - 1;
            if (i > n - 1) i = 0;
        } while (circl[i] != 1);
        return "1" + way;
    }
}
