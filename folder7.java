// funtion and modules 
// how the functios were perform 

import java.util.*;
public class folder7 {
    // public static void helloworld() {
    //     System.out.println("helloworld");
        
    // }
    // public static void main(String[] args) {
    //     helloworld();// function call
        
    // }


    // // syntax with parameters
    // public static void calcualte (int a , int b) { // note- this value is called parameters or formal parameters
    //         int sum = a + b;
    //     System.out.println("sum is :"+sum);
    
        
        
    // }
    // public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calcualte (a ,  b);// note- this is also called the actual parameters 
    // }
    

    // topic- call by value
    // note - this the code to swap the two values in normal form
// public static void main(String[] args) {
//     int a=5,b=6;
//     int temp = a ;
//     a = b;
//     b =temp;
//     System.out.println("A = " + a);
//     System.out.println("A = " + a)
// }
// note - java always do call by value; 
// note - this the code to swap the two values in using the functions
// public static void swap(int a , int b) {
// int temp = a; 
// a = b;
// b= temp;
// System.out.println("A = " + a);
//  System.out.println("b = " + b);
    
// }
// public static void main(String[] args) {
    
// }

// topic - find the factorial of n;

public static int factorial(int n) {
    int f = 1;
    for (int i=1; i<= n; i++){
        f = f * i;
    }
    return f;
    
}   
public static void main(String[] args) {
    System.out.println(factorial(4));
}
}











