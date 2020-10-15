package com.company.MyProject;

import java.util.Scanner;

import static com.company.MyProject.MathOperation.mathOperation.*;
import static com.company.MyProject.MathOperation.mathOperation.DIVIDE;

public class MathOperation {
    public enum mathOperation {
        SUM,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
    static mathOperation getOperation() {
        Scanner sc = new Scanner(System.in);
        mathOperation operation;
        System.out.println("Введите опреацию: +, -, *, /");

        String tmp = sc.nextLine();
        switch (tmp) {
            case "+":
                operation = SUM;
                break;

            case "-":
                operation = SUBTRACT;
                break;

            case "*":
                operation = MULTIPLY;
                break;

            case "/":
                operation = DIVIDE;
                break;

            default:
                operation = SUM;
        }
        return operation;
    }
    static int result(int num1, int num2, mathOperation operation) {
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
