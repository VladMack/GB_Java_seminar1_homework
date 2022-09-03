import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        calc_ui();
    }

    public static void calc_ui() {
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
        continue_or_not();
    }

    public static void continue_or_not() {
        Scanner input = new Scanner(System.in);
        String con_or_not = "";
        while (!(con_or_not.equalsIgnoreCase("yes")) && !(con_or_not.equalsIgnoreCase("no"))) {
            System.out.println("Хотите продолжить? (yes или no)");
            con_or_not = input.nextLine();
        }
        switch (con_or_not) {
            case "yes":
                calc_ui();
            case "no":
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
