
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
