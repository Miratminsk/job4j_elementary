package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(17, 29, 88, 86);
        System.out.println("result (17, 29) to (88, 86) " + result);

        result = Point.distance(91, 53, 29, 78);
        System.out.println("result (91, 53) to (29, 78) " + result);
    }
}
