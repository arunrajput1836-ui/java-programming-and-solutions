// loops in java program and solutions
// Display number from 1 to n
public class loops{
    public static void main(String args[]){
        int i, n= 15;
        for(i = 1; i <= n ; i++){
            System.out.println(i);
        }
    }
}

// Sum of natural numbers up to 20
public class loop {
    public static void main(String args[]) {
        int sum = 0; // 1. Variable to hold the running total

        for (int i = 1; i <= 20; i++) { // 2. Loop from 1 to 20
            sum = sum + i; // 3. Add current number to sum (or sum += i)
        }

        System.out.println("Sum is: " + sum); // 4. Print total after loop finishes
    }
}

// multiplication table
public class loop{
    public static void main(String args[]){
        int n =3;
        for(int i = 1; i<=10;i++)
            System.out.println(n + "x" + i +"=" +(n*i));
    }
}

//even and odd no
public class loop{
    public static void main(String args[]){
        int i = 1, n=50;
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("The number" + i + "is even");
            }else
                System.out.println("The number" + i +"is odd");
        }
    }
}

//factorial of a no.
 public class loop{
     public static void main(String args[]){
         int i = 1, n =7;
        int factorial = 1;
        for(i = 1;i<=n;i++){
             factorial *=i;
      }System.out.println(factorial);

     }
 }
// Even and Odd Numbers
//Accept a range of numbers and display all even numbers followed by all odd numbers within the given range.
 public class loops{
    public static void main(String args[]){
        int  n =20;

        System.out.println("Even no" );
            for(int i=1;i<=n;i++){
                if (i%2==0){
                    System.out.println(i +"is an even no");
                }
            }
        System.out.println("odd no");
            for(int i=1;i<=n;i++){
                if (i%2 !=0){
                    System.out.println(i + "is odd no");
                }
            }
            }

//Reverse Counting
// using fo loop
     public class loops{
    public static void main (String args[]){
        int i = 10, n =1 ;
        for (i =10; i>=n;i--){
            System.out.println(i);
        }
    }
}

// using while loop
     public class loops{
    public static void main(String args[]){
        int i =10, n =1;
        while (i>=n){
             
            System.out.println(i);
              i--;
        }
    }
}

