
// Bank Account no masking.
import java.util.Scanner;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acoount no");
        String acc = sc.nextLine();
        char ar[] = acc.toCharArray();
        for(int i = 0;i<ar.length-4;i++)
            ar[i]  ='*';

        String maskedAcc = new String(ar);
        System.out.println(maskedAcc);
    }
    
}

// name search
public class namesearch{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String name[] = new String[n];

        for(int i = 0;i<n;i++)
            name[i]=sc.nextLine();

        System.out.println("Enter searching name");
        String SearchName = sc.nextLine();
        int flag =0;
        for(int i =0;i<n;i++)
        {
            if (name[i].equalsIgnoreCase(SearchName))
            {
                flag =1;
                break;
            }
        }
        if(flag ==0)
            System.out.println("name not found");
        else
            System.out.println("name found");
     }
}
