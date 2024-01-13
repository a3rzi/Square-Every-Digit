package org.example;

public class Main {
    public static void main(String[] args) {
        //given
        //An input of 765
        int n = 765;

        //when
        //will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
         int result =  squareDigits(n);

        System.out.println("Result after squaring digits: " + result);
    }

    private static int squareDigits(int n) {
        String num2str = String.valueOf(n);

        for (int i = 0; i < num2str.length(); i++) {
            char num = num2str.charAt(i);
            int num2int = Character.getNumericValue(num);
            int squaredDigit = num2int* num2int;

            return 0;
        }
        return n;
    }

}