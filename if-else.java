find odd and even number program.
public class ifelse{
    public static void main( String args []){
        int a = 19;
        if ( a % 2 == 0){
            System.out.println("even");
        }
        else 
            System.out.println("odd");
        }
    }

// nested if
public class ifelse{
    public static void main (String args []){
        int a = 19;
        if (a > 10){
            System.out.println("right");

                if (a < 10){

                    System.out.println("wrong");
                }else{
                     System.out.println("nice");
                }
            }else{              
                    System.out.println("good");
                }
        }
    }

//grater of two no
public class ifelse{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
    if (a > b){
        System.out.println("a is freater ");
    }else{
    System.out.println("b is greater");
        }
    }
}

// temprature category

public class ifelse{
    public static void main(String args[]){
        int temp = 10;
    if (temp < 10){
        System.out.println("cold");
    }else if (temp > 10 || temp < 25){
        System.out.println("moderate");
    }
    else if (temp >= 25){
        System.out.println("hot");
    }

    }
}
// positive no,
public class ifelse{
    public static void main(String args[]){
        int a = 2;
        if (a > 0 ) {
            System.out.println("positive no");
        }else if (a < 0) {
            System.out.println("negtive no");
        }
         else{
            System.out.println("zero");
         }

        }
    }
// voting eligibility criteria
public class ifelse{
    public static void main(String args[]){
        int age = 18;
        if ( age >= 18){
            System.out.println("Eligible");
        }
        else {
            System.out.println("not eligible");
        }
    }
}
