import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите название файла:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File fileToRead = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead))
        ) {
            List<Integer> array = new ArrayList<>();
            String line = "notNull";
            while (line != null) {
                line = reader.readLine();
                if (line == null) break;
                array.add(Integer.parseInt(line));
            }
            Collections.sort(array);
            int middle = array.size() / 2;
            int medianValue = Integer.parseInt(array.get(middle).toString());
            if (array.size() % 2 == 0) {
                medianValue = (medianValue + Integer.parseInt(array.get(middle - 1).toString())) / 2;
            }
            int finalMedianValue = medianValue;
            final int[] summ = {0};
            array.forEach((number) -> summ[0] = summ[0] + (Math.abs(number - finalMedianValue)));
            System.out.println(summ[0]);
        } catch (IOException ignored) {
        }
    }
}
