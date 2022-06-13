package com.company;

abstract class Abstract {
int c;
    //In abstract class we are not able to create a object.
    //the abstract class is used hide an information from coustomer.
    //

    public void main(){
        System.out.println("hello sahil");
    }
   Abstract(int a, int b ){
       c=a+b;
       System.out.println(c);
   }

    public static void first(){ System.out.println("unknow");}
    public static void main(String[] args){
        first();
    }
}

// WHEN WE HAVE A SAME METHOD AS PRAENT CLASS IN SUB CLASS IS KNOWS AS OVERRIDING
//WHEN WE SAME METHOD IN A CLASS WITH DIFFERENT PARAMETER IS KNOWS AS OVERLOADING
/* ABSTRACTION IS CLASS WHICH IS CREATED BY USING A ABSTRACT KEYWORD.IT IS DONE TOGET 0 TO 100%
    ABSTRACTION.IT IS DONE TO HIDE AN INFORMATION AND SHOW ONLY FUNDAMENTAL INFORMATION TO CLIENT.
    WE CANNOT CREATE OBJECT OF ABSTRACT CLASS BUT WE CREATE A REFERENCE OF ABSTRACT CLASS.
 */
// INTERFACE IS DONE TO GET 100% ABSTRACTION.BEFORE JAVA 8 WE ARE USING ONLY ABSTRACT METHOD BUT AFTER IT
// WE ARE ABLE TO USED PRIVATE , DEFALUT , STATIC METHOD IN IT.