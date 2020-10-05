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

        public static char getOperation() {
            System.out.println("Введите опреацию");
            char operation;
            if(scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы ввели невреное значение. Попробуйте еще раз");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation) {
            int result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите еще раз");
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }
}