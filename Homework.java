import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        calcUI();
    }

    public static void calcUI() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.printf("Введите второе число: ");
        double b = Double.parseDouble(input.nextLine());
        String oper = "";
        while (!(oper.equals("+")) && !(oper.equals("-")) && !(oper.equals("*")) && !(oper.equals("/"))) {
            System.out.printf("Введите желаемую операцию: ");
            oper = input.nextLine();
        }
        double result = calculator(a, b, oper);
        System.out.print("Результат: ");
        System.out.println(result);
        continueOrNot();
    }

    public static void continueOrNot() {
        Scanner input = new Scanner(System.in);
        String conOrNot = "";
        while (!(conOrNot.equalsIgnoreCase("да")) && !(conOrNot.equalsIgnoreCase("нет"))) {
            System.out.println("Хотите продолжить?");
            conOrNot = input.nextLine().toLowerCase();
        }
        switch (conOrNot) {
            case "да":
                calcUI();
            case "нет":
                break;
        }
    }

    public static double calculator(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return 0;
    }
}
