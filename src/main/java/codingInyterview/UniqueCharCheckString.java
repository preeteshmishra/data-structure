package codingInyterview;

import java.util.Scanner;

public class UniqueCharCheckString {


    public static void main(String[] args) {

UniqueCharCheckString uniqueCharCheckString = new UniqueCharCheckString();


        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.print(uniqueCharCheckString.isUniqueChars2(str));

    }


    public  boolean isUniqueChars2(String str) {

    boolean []charArray = new boolean[256];

    for(int i = 0;i<str.length();i++){

        int charValue = str.charAt(i);

        if(charArray[charValue]) return false;

        charArray[charValue] = true;

    }

    return true;





    }
}