package Am_I_Smallest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int c=0;
        for(int j=0;j<t;j++)
        {
            String s = sc.nextLine();
            int n = s.length();


            for (int i = 0; i < n - 1; i++)
            {


                if (s.charAt(i) > s.charAt(i + 1))
                {
                    c=1;
                }


            }
            if(c==1)
            {
                System.out.println("Yes");

            }
            else
            {
                System.out.println("No");
            }
        }
    }
}