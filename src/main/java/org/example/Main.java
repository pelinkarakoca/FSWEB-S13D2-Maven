package org.example;

import java.util.Arrays;

import static java.lang.Math.log10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num){
        int numAbsolute = Math.abs(num);
        String strNum = String.valueOf(numAbsolute);
        String[] strNumArr = strNum.split("");
        String[] reversedArr = new String[strNumArr.length];
        for(int i = 0; i < strNumArr.length; i++){
            reversedArr[i] = strNumArr[strNumArr.length - 1 - i];
        }
        String reversedStr = String.join("", reversedArr);
        return reversedStr.equals(strNum);
    }
    public static boolean isPerfectNumber(int num){
        if(num < 3) return false;
        int sum = 1;
        for(int i = 2; i <= num/2; i++ ){
            if(num% i == 0){
                sum += i;
            }
        }
    return sum == num;
    }
   public static String numberToWords(int num){
        if(num < 0) return "Invalid Value";
        String[] numToWords = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numString = String.valueOf(num);
        StringBuilder resultBuffer = new StringBuilder();

        for(int i = 0; i < numString.length(); i++){
            String index = String.valueOf(numString.charAt(i));
            int indexInt = Integer.parseInt(index);
            resultBuffer.append(numToWords[indexInt]);
            resultBuffer.append(" ");
        }
        return resultBuffer.toString().trim();
   }

}
