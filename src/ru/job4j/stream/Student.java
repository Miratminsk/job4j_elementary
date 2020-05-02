package ru.job4j.stream;

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        String result = "score - " + score;
        return "score - " + score;
    }

    public int getScore() {
        return score;
    }
}
