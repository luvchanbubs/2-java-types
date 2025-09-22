package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String numStr = String.valueOf(value);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(reversedStr);

    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
