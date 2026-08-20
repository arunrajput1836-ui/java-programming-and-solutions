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
