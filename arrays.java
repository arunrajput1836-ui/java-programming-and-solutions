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
