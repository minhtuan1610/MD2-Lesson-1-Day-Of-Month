import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = "31";
                break;
            case 4, 6, 9, 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }
        if (!daysInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        } else {
            System.out.print("Invalid input!");
        }
    }
}
/*switch (month) {
            case 2 -> System.out.print("The month '2' has 28 or 29 days!");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.print("The month '" + month + "' has 31 days!");
            case 4, 6, 9, 11 -> System.out.print("The month '" + month + "' has 30 days!");
            default -> {
            }
        }*/