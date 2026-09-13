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

// student grade calculator
public class ifelse{
    public static void main(String args[]){
        int grade = 56;
        if (grade >=40){
            System.out.println("grade D");}
            else if (grade >= 60){
                System.out.println("grede c");}
                else if (grade >=75){
                    System.out.println("grade b");}
                    else if (grade >=90){
                        System.out.println("grade a");
                    }else {
                        System.out.println("fail");
                    }
                }

    // largest no;
public class ifelse{
    public static void main(String args[]){
        int a = 100, b = 15, c = 20;
        if(a>b && a > c){
            System.out.println("a is largest");}
        else if (b > a && b > c){
            System.out.println("b is largest");}
        else if (c>a && c> b){
            System.out.println("c is largest");
        }

    }
}

     public class ifelse{
    public static void main(String args[]){
        int day = 5;
        switch(day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("tuesaday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");

                }}}
// public class ifelse{
    public static void main(String args[]){
         int num1 = 5;
         int num2 = 10;
         char op = '*';
        
         int result;
        switch (op){
            case '+':
                result = num1 + num2;
                System.out.println( result);
                
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
                 
