package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        if (height < 150) {
            return -1;
        }
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        if (height < 130) {
            return -1;
        }
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(189);
        System.out.println("Man 189 is " + man);

        double woman = Fit.womanWeight(170);
        System.out.println("Woman 170 is " + woman);
    }
}
