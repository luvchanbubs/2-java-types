package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if (x == 0) {
            return "true";
        }
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                return "false";
            }
            temp = temp / 10;
        }

        return "true";

    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
