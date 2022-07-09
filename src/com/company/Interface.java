package com.company;

public interface Interface {
  abstract void d();
    default void n(){
        System.out.println(" hero");
    }

    static void main(){
        System.out.println(" hello");
    }
    private void m(){
        System.out.println(" boss ");
    }

    public static void main(String[] args) {
main();

    }


}
// we cannot create non abstract method in interface.
// we cannot create an object in interface.
// the interface can have only abstract , private ,default and static method in it.
//we can not implement the method of interface .