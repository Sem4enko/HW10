import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        markGenerator();
    }

    private static void markGenerator( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mark:");
        Integer num = scanner.nextInt();


        String textMark = switch (num) {
            case 9, 10 -> "Well";
            case 7, 8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 1, 2, 3, 4 -> "Very Bad";
            default -> "Please input marks from 0 to 10 ";

        };
        System.out.println(textMark);
    }
}

