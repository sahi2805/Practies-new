package com.company;

public class ForLoop {
    //Display the array in matrix
    public static void main(String[] args) {
            int[][] a={{12,45,67},{45,78,67},{54,34,54}};
    for(int i=0; i<a.length; i++) {
for (int j=0; j<a.length;j++){
    System.out.print(a[i][j]+" ");
}
        System.out.println();
    }
// Print array using array
    int[] n=new int[]{29,59,40,37};
        for (int m:n) {
            System.out.println(m);
        }
    }

}
