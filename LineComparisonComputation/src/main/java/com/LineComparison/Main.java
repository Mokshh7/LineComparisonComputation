package com.LineComparison;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 5, 7);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}