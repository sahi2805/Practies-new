package com.company;

class Encapsulation {
private  int f;
public void SetValue(int d){
    f=d-34;
}
public int GetValue(){
    return f;

}
}
class Second{
    public static void main(String[] args) {
        Encapsulation n=new Encapsulation();
        n.SetValue(59);
        System.out.println(n.GetValue());
    }
}
// the ecapsulation is done for hidding an information from client.in encapsulation we used private method.
 //   to acces it we used getter and setter method .