package com.company.MyProject;

public class Main extends Logic {
        public static void main(String[] args) {
            int num1 = getNum();
            int num2 = getNum();
            mathOperation operation = getOperation();
            int result = result(num1, num2, operation);
            System.out.println("Результат: " + result);
            try {
                checkingErr(5);
                checkingErr(12);
            } catch (MyException e) {
                e.massOfMyException();
            }
            
        }

        static void checkingErr(int a) throws MyException {
            if (a > 10)
                throw new MyException(a);
            System.out.println("No error in prog. no exception caught");
        }
}