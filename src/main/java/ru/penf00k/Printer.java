package ru.penf00k;

public class Printer {

    public static void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println((i + 1) + ": " + text);
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
