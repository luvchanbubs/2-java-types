package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int number = x + y;
        if (number == 0){
            return 1;
        }
        int absoluteNum = Math.abs(number);
        int digitCount = 0;
        while (absoluteNum>0){
            digitCount++;
            absoluteNum = absoluteNum/10;
        }
        return digitCount;



    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
