package com.company;

import java.util.Scanner;

class ifStatement {
    public static void main(String[] args) {
        //The program on if statements
        int markobtain;
        int markerequired=40;
        Scanner r=new Scanner(System.in);
        markobtain=r.nextInt();
        if(markobtain>markerequired)
        {
            System.out.println("you passed the exam");
            if (markobtain>90){
                System.out.println(" passed in grad distintion");
            }
            else if (markobtain>75){
                System.out.println("pass in first grad");
            }
        }
    else {
            System.out.println("fail the exam");
        }
    }



    }

