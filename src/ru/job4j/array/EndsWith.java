package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int postIndex = 0;
        for (int index = word.length - post.length; index < word.length; index++) {
            if (word[index] != post[postIndex++]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
