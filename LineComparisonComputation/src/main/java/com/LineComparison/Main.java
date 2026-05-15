package com.LineComparison;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);

        double length = line1.calculateLength();

        System.out.println("Length of line is: " + length);
    }
}