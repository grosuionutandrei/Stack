package com.company;

public class Main {

    public static void main(String[] args) {
	String normal = "Maria";
        System.out.println(isPalindrome(normal));
        System.out.println(isPaliondrome1(normal));


    }
    public static boolean isPalindrome(String string1){
        int i =0;
        int j = string1.length()-1;
        while (i<j){
            j--;
            i++;
            if(string1.charAt(i)==string1.charAt(j)){

               return true;

            }
        }
        return false;
    }
    public static boolean isPaliondrome1(String string){
        String temp = null;
        for(int i = string.length()-1;i>=0;i--){
            temp+= string.charAt(i);
        }
        try{

        if(string==temp){
            throw new Exception("ana are mere");

        }}catch(Exception e){
            System.out.println("Ana");
        }
        return  false;

    }
}
