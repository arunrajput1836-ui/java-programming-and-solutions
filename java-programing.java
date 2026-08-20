# java-programming-and-solutions
Java Programming is my personal coding journey where I solve Java programs daily. This repo contains a growing collection of Java solutions, ranging from beginner-friendly exercises to advanced problem-solving challenges.
// check prime no.
import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            { 
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }  
        }

        
    // with two classes connect first is boolean and second to add this prime class to second void maindatory
import java.util.Scanner;
public class loops{
public static boolean prime(int n){
    for(int i =2;i<=Math.sqrt(n);i++)
        if(n%i==0)
            return false;
    return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        System.out.println(prime(n)?"prime": "9not prime");
    }
}

// to find factorail of a number
import java.util.Scanner;
public class  loops{
    public static int fact(int n)
    {
        int f=1;
        for(int i =1;i<=n;i++)
            f*=i;
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        System.out.println("factorial="+fact(n));
    }
    
}


    
