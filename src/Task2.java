import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        percentGenerator();
    }

    private static void percentGenerator(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, input numbers set: ");

            String numbers = scanner.next();
            String[] numbersArray = numbers.split(",");

            List<Integer> numbersList = new ArrayList<>();
            for (String s : numbersArray) {
                numbersList.add(Integer.parseInt(s));
            }
            double result = numbersList.stream().collect(Collectors.teeing(
                    Collectors.counting(),
                    Collectors.toSet(),
                    (num, set) -> ((double) set.size() / (double) num * 100)));

            System.out.println("Result of numbers -  " + result + "%");
        } catch (NumberFormatException n){
            System.out.println("Please list numbers through \",\"");
            percentGenerator();
        }
    }
}
