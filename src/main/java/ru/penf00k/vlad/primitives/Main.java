package ru.penf00k.vlad.primitives;

public class Main {

    public static void main(String[] args) {
        printMaxMin(Byte.MAX_VALUE, Byte.MIN_VALUE);
        printMaxMin(Short.MAX_VALUE, Short.MIN_VALUE);
        printMaxMin(Integer.MAX_VALUE, Integer.MIN_VALUE);
        printMaxMin(Long.MAX_VALUE, Long.MIN_VALUE);

        char beeeeee = 'a';
        System.out.println(beeeeee);

        boolean bbbb = false;
        System.out.println(bbbb);
        System.out.println(!bbbb);

//        Integer a = new Integer(5);
//        Integer b = new Integer(5);
        Integer a = 5;
        Integer b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a = b? " + (a == b));
        System.out.println("a = b? " + (a.equals(b)));
    }

    private static void printMaxMin(long max, long min) {
        System.out.println("max = " + max + ", min = " + min);
    }
}
