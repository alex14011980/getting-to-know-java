import java.util.Arrays;
import java.util.ArrayList;

public class task11 {

    class Answer {
        public static void analyzeNumbers(Integer[] arr) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("Minimum is " + Arrays.stream(arr).min(Integer::compareTo).get());
            System.out.println("Maximum is " + Arrays.stream(arr).max(Integer::compareTo).get());
            System.out.println("Average is = " + (double) (Arrays.stream(arr).mapToInt(value -> value).sum() / Arrays.stream(arr).count()));


        }
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    class Printer{
        public static void main(String[] args) {
            Integer[] arr = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
            }
            else{
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            Answer ans = new Answer();
            ans.analyzeNumbers(arr);
    }
}
