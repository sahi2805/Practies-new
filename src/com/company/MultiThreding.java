package com.company;

public class MultiThreding extends Thread {
    @Override
    public void run(){
        for (int i=0; i<5; i++){
        System.out.println("hello");
    }}
}
class A{
    public static void main(String[] args) {
        MultiThreding n = new MultiThreding();
        n.start();
        for (int i = 0; i < 5; i++) {

            System.out.println("akhilesh");
        }
    }
}
 //The main different between extend and runnable interface is that if in extend thread class we want
// to extent other class then it is not possible because it dose not support the multiple inheritance, and
//in runnable interface we can imported and extend also.