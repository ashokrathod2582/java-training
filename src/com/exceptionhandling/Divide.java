package com.exceptionhandling;

public class Divide {

    public static void main(String[] args) throws CustomException {
        int a = 100, b = 0;
        try{
            int result = a/b;
            System.out.println(result);
        }catch (Exception e){
            throw new CustomException("Divide number by 0 not possible");
        }
    }
}
