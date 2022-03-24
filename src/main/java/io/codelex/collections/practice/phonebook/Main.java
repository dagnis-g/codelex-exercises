package io.codelex.collections.practice.phonebook;

public class Main {
    public static void main(String[] args) {

        PhoneDirectoryRewrite directory = new PhoneDirectoryRewrite();

        directory.putNumber("Anna", "3721987");
        directory.putNumber("Peter", "34534534");
        directory.putNumber("John", "53454");
        directory.putNumber("Lisa", "345345345");
        directory.putNumber("Brad", "345345345");

        System.out.println(directory);

        System.out.println(directory.getNumber("Anna"));
        System.out.println(directory.getNumber("Miguel"));

    }
}
