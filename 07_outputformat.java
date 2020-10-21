/*next() can read the input only till the space. It can't read two words separated by a space. Also, next() places the cursor in the same line after reading the input.
nextLine() reads input including space between the words (that is, it reads till the end of line \n )*/

//Format specifiers: %d for decimals, %s for Strings. "-" for left aligning usually Strings are aligned in the right. -15: 15 characters in the String are left aligned
//For output formatting, use printf

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}
