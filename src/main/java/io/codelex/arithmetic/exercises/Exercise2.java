package io.codelex.arithmetic.exercises;

public class Exercise2 {
    public static void main(String[] args) {
        checkOddEven(4);
    }
    public static void checkOddEven(int num){
        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
