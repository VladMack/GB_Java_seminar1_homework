import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Homework {
    public static void main(String[] args) throws IOException {
        calcUI();
    }

    public static void calcUI() throws IOException {
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

    public static void continueOrNot() throws IOException {
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

    public static double calculator(double num1, double num2, String operation) throws IOException {
        double result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        LoggerMethod(num1, num2, result, operation);
        return result;
    }

    public static void LoggerMethod(double num1, double num2, double result, String operation) throws IOException {
        Logger logger = Logger.getLogger(Homework.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);


        logger.info(String.valueOf(num1) + " " + operation + " " + String.valueOf(num2) + " = " + String.valueOf(result));
    }
}
