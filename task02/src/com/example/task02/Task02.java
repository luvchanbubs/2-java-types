package com.example.task02;

public class Task02 {

    public static String solution(String numberStr) {
        long number = Long.parseLong(numberStr);

        if (number>=Byte.MIN_VALUE && number<=Byte.MAX_VALUE) {
            return "байт";
        }
        else if (number>=Short.MIN_VALUE && number<=Short.MAX_VALUE) {
            return "короткий";
        }
        else if (number>=Integer.MIN_VALUE && number<=Integer.MAX_VALUE) {
            return "int";
        }
        else {
            return "long";
        }

    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
