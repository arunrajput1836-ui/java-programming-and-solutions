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
