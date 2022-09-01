package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            // Dividing the first number by the second number and adding the remainder to the final number.
            int remainder = firstNumber/secondNumber;
            finalNumber = finalNumber + remainder;
            System.out.println(finalNumber);


            //Handle specific exception
        }catch ( ArithmeticException exception){
          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }


}
