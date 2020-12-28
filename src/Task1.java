import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        markGenerator();
    }

    private static void markGenerator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mark:");
        Integer num = scanner.nextInt();


        switch (num) {
            case 0, 1, 2, 3, 4:
                System.out.println("Very Bad");
                break;
            case 5:
                System.out.println("Bad");
                break;
            case 6:
                System.out.println("Accepted");
                break;
            case 7, 8:
                System.out.println("Good");
                break;
            case 9, 10:
                System.out.println("Well");
                break;
            default:
                System.out.println("Please input marks from 0 to 10");
                markGenerator();
        }
    }
}

