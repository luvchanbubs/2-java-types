package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int lenght = n / k;
        int width = m / k;
        int result = lenght * width;
        return result;

    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
