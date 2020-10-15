package com.company.MyProject;

public class MyException extends Exception {
    int id;

    public MyException(int x) {
        id = x;
    }

    public void massOfMyException() {
        System.err.println("My exception");
    }
}
