package com.company;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if(b==0){
            throw new ArithmeticException("the value of b can't be zero");
        }

        int c = a / b;

/*        try {
            int c = a / b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("hello");
        }
 */

      //  int c = a / b;
        System.out.println("hello world");

    }
}
// to handle a run time error in a program the expection are used.
// or when we get an unwanted result in a program.
// the throw is a massage which show that this should be handle by try and catch method.
// throws shows that this method can show an expection.
// finally block only used when their is try catch method.
