import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        File fileToRead1 = new File("1.txt");
        File fileToRead2 = new File("2.txt");
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileToRead1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileToRead2));
        ) {
            String[] xoyo = reader1.readLine().split(" ");
            double xo = Double.parseDouble(xoyo[0]);
            double yo = Double.parseDouble(xoyo[1]);
            double r = Double.parseDouble(reader1.readLine());
            double r2 = r * r;
            int n = 100;
            double result;
            for (int i = 0; i < n; i++) {
                String[] xy = reader2.readLine().split(" ");
                double x = Double.parseDouble(xy[0]);
                double y = Double.parseDouble(xy[1]);
                result = (xo - x) * (xo - x) + (yo - y) * (yo - y);
                if (result < r2) System.out.println("1");
                if (result == r2) System.out.println("0");
                if (result > r2) System.out.println("2");
            }
        } catch (IOException ignored) {
        } catch (NullPointerException e) {
            System.out.println("Файл с координатами кончился");
        }
    }

}
