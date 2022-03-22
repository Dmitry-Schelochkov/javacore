package practice;

import java.util.Scanner;

public class Calculate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a1 = getInt();
        int a2 = getInt();
        char operation = getOperation();
        int result = calc(a1, a2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число: ");
        int a;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Не верное число");
            scanner.hasNextInt();
            a = getInt();
        }
        return a;
    }

    public static char getOperation() {
        System.out.println("Ввудите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Операция не распознана");
            scanner.hasNext();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int a1, int a2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = a1 + a2;
                break;
            case '-':
                result = a1 - a2;
                break;
            case '*':
                result = a1 * a2;
                break;
            case '/':
                result = a1 / a2;
                break;
            default:
                System.out.println("Операция не выполнима");
                result = calc(a1, a2, getOperation());

        }
        return result;

    }
}
