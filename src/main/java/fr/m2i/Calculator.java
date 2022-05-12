package fr.m2i;

public class Calculator {
    int result;
    public int add(int num1, int num2){
        result=num1+ num2;
        return result;
    }
    public int substract(int num1, int num2){
        result= num1-num2;
        return result;
    }
    public int multiply(int num1 , int num2  ) {
        result = num1 * num2;
        return result;
    }
        public float division(int num1, int num2){
            result=num1/num2;
            return result;
        }


    }

