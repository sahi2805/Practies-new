package com.company;

public class Constructor {
    // we can not call default constructor, private constructor from other class
int c;
    Constructor(){

    System.out.println("jello");
}
    Constructor(int a, int b){

    System.out.println("The value of a"+a+"The value of b is"+b); }
/* private Constructor()
 {System.out.println("velle");}
 */

// Method overloading
    void main(){

        System.out.println("sahil");
    }
    void main (int a,int b ){
c=a+b;
        System.out.println(c);
    }
    void s(int i,int o){
        System.out.println("The value of i"+i+" "+"The value of o"+o);

        System.out.println("nilu");
    }
    public static void main(String[] args) {
Constructor n=new Constructor(30,45);
n.main();

    }
}
