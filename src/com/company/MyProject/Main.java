package com.company.MyProject;

public class Main extends Logic {
        public static void main(String[] args) {
            try {
            int num1 = getNum();
            int num2 = getNum();
            MathOperation mathOperation = getOperation();
            int result = result(num1, num2, mathOperation);
            System.out.println("Результат: " + result);
            }catch (ArithmeticException e){
                System.out.println("Делить на ноль - нельзя!");
            }
            System.out.println("Программа работает успешно!");
    }
}