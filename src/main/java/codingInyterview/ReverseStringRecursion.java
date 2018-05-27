package codingInyterview;

import java.util.Scanner;

public class ReverseStringRecursion {

    public static void main(String[] args) {


ReverseStringRecursion reverese = new ReverseStringRecursion();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.print(reverese.doReverese(str));
    }





    String doReverese(String str){

        if(str.length() == 1 || str == null)return  str;

//System.out.println(str.substring(1));

            String reverse = doReverese(str.substring(1)) + str.charAt(0);
           System.out.println(reverse);

            return reverse;

               }
}
