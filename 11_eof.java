//scan.hasNext() returns true if there is an input next to the element.
//scan.nextLine() inputs a String

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int i = 1;
       while(scan.hasNext()) {
           System.out.println(i + " " + scan.nextLine());
           i++;
       }
       scan.close();
    }
}

