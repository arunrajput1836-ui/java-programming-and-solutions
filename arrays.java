// student register

import java.util.Scanner;
public class array{
    public static void main(String args[]){
        int n=30;
        boolean ar[]=new boolean[n];
        Scanner sc = new Scanner(System.in);

        for (int i =0;i<n;i++){
            ar[i]=sc.next().equals("p")?true:false;
        }
        int countP=0;
        for(boolean b:ar)
            if(b)
                countP++;
            System.out.println("present" +countP);
            System.out.println("absent" + (n-countP));
            System.out.println("percent" +((float)countP/n*100));

    }
}


import java.util.Scanner;

public class demoFirst{
    public static void main(String []args){
        int n =10;
        float ar[]=new float[n];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<n;i++)
        {
            ar[i]= sc.nextFloat();

        }
        float max=ar[0];
        float min=ar[0];
        float sum=0;
        for(float p:ar)
        {
            if(p>max)
                max=p;
            if(p<min)
                min=p;
            sum=sum+p;

        }
        System.out.println("total Billl" +sum);
        System.out.println("total Billl" +max);
        System.out.println("total Billl" +min);
        System.out.println("total Billl" +sum/n);
    }
}
// this is my first step towards the array;
 public class array {
    public static void main(String args[]){
        int [] arr = { 10,20,30,40,50};
        System.out.println(arr[1]);//for checking index value at 1;
        //updating the value of array at index 2;
        arr[1]=200;
        System.out.println(arr[1]);
        


    }
    
}
 // length of an array
public class array{
    public static void main (String args[]){
        int [] arr = { 10,20,30,40,50};
        System.out.println(arr.length);
    }
}
// for printing whole array and updating the same array and them printing it again

public class array{
    public static void main (String args[]){
        int [] arr = { 10,20,30,40,50,60,70,80};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        arr[1] = 300;
        for (int j = 0; j<arr.length;j++){
        System.out.println(arr[j]);
        }
    }
}

//taking input from the user;
import java.util.Scanner;
public class array{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];// Declaration of array;
        for(int i = 0;i < arr.length;i++){//loop for getting multiple values
             System.out.println("Enter the number"+ (i + 1)+":");// getting from user
             arr[i] = sc.nextInt();// storing the values in array
        }
        // printing the values that store by the user
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

// calculate their sum using a loop.
import java.util.Scanner;
public class array{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
            int [] number = new int[5];
            for(int i = 0; i < number.length; i++){
                System.out.println("Enter the number"+ (i +1)+ ":");
                number[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0 ; i < number.length;i++){
            sum = sum + number[i];
            }
            System.out.println("sum = "+ sum);



        }
    //  finding the maximum number from an array;
import java.util.Scanner;
public class array{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[6];
        for(int i = 0;i< arr.length;i++){
            System.out.println("Enter the no"+(i+1)+":");
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0;i< arr.length;i++)
            if(arr[i]>max){  
                max = arr[i];
            }
            System.out.println("The maximum no of the array is :"+max);

            
        }
         
    }
    
