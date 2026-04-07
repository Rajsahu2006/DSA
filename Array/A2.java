package Array;

import java.util.Scanner;

public class A2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size :");
    int n = sc.nextInt();
    int[] arr = new int[n];
    //Input line
    System.out.println("Enter array elements");
    for( int i=0; i<n;i++){
        arr[i] = sc.nextInt();

    }
    // output line
    for( int i=0;i<n;i++){
        System.out.print(arr[i]+"  ");
    }
   } 
    
}
