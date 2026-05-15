package com.LineComparison;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 10, 12);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        int result = Double.compare(length1, length2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}