package com.company.MyProject;

import java.util.Scanner;

public class Logic extends MathOperation {
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
}