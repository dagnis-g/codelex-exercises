package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        //fixme - should be 15 :| 
        int sum = (int) (Integer.parseInt(a) + b + c + d + e);
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        //fixme - should be 15.5 :| 
        float sum = (float) (Integer.parseInt(a) + b + c + d + e);
        System.out.println(sum);
    }
}
