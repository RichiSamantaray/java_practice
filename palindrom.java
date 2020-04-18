import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {

        int num = 121, reversedInteger = 0, rem, originalInteger;

        originalInteger = num;

        while( num != 0 )
        {
            rem = num % 10;
            reversedInteger = reversedInteger * 10 + rem;
            num  /= 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}