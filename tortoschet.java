import java.util.Scanner;

public class tortoschet {
    String number;

    public tortoschet() {
    }

    public static void main(String[] args) {
        while(true) {
            System.out.print("Привет, сколько сантиметров, метров или милиметров твой торт?");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number == 0) {
                System.exit(0);
            }

            if (number % 2 == 0) {
                System.out.print("Сколько разрезов нужно зделать? Введите число: ");
                Scanner scam = new Scanner(System.in);
                int rozrez = scam.nextInt();
                int solution = number / rozrez;
                if (number == rozrez) {
                    System.out.println("Не издевайся;) Ответ " + number);
                } else {
                    System.out.println("Торт можно разрезать на " + solution + " ровных части(ей)!");
                }
            } else {
                System.out.println("Невозможно разделить торт на ровные части!");
            }
        }
    }
}
