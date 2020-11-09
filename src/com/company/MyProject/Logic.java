package com.company.MyProject;

import java.util.Scanner;


public class Logic {
        static Scanner scanner = new Scanner(System.in);

        public static int getNum() {
            System.out.println("Введите число:");
            int num;
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Вы ввели неверное число. Попробуйте еще раз");
                scanner.next();
                num = getNum();
            }
            return num;
        }
    public enum MathOperation {
        SUM,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
    static MathOperation getOperation() {
        Scanner sc = new Scanner(System.in);
        MathOperation operation;
        System.out.println("Введите опреацию: +, -, *, /");

        String tmp = sc.nextLine();
        switch (tmp) {
            case "+":
                operation = MathOperation.SUM;
                break;

            case "-":
                operation = MathOperation.SUBTRACT;
                break;

            case "*":
                operation = MathOperation.MULTIPLY;
                break;

            case "/":
                operation = MathOperation.DIVIDE;
                break;

            default:
                operation = MathOperation.SUM;
        }
        return operation;
    }
    static int result(int num1, int num2, MathOperation operation) {
        int res;

        switch (operation) {
            case SUM:
                res = num1 + num2;
                break;

            case SUBTRACT:
                res = num1 - num2;
                break;

            case MULTIPLY:
                res = num1 * num2;
                break;

            case DIVIDE:
                res = num1 / num2;
                break;

            default:
                res = result(num1, num2, getOperation());

        }
        return res;
    }
}