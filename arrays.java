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
