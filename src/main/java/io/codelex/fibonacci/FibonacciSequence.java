package io.codelex.fibonacci;

public class FibonacciSequence {

    public int getNumber(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("no good");
        } else if (index <= 2) {
            return index - 1;
        } else {
            return getNumber(index - 1)
                    + getNumber(index - 2);
        }

    }

//    private int getFibonacciNumber(int index) {
//        return index <= 2 ? index - 1 : getFibonacciNumber(index - 1)
//                + getFibonacciNumber(index - 2);
//
//    }

}


