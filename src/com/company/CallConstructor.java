package com.company;

public class CallConstructor extends Constructor {
   CallConstructor(){
       super(34,43);

   }
//  THE OVERRIDING METHOD
    @Override
    void s(int i, int o) {
        super.s(i, o);
    }

    void s(){

   }
    public static void main(String[] args) {
        CallConstructor r=new CallConstructor();
        r.s(150,260);
    }
}


