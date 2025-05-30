
// input 10 ----> 10
// input A ------> A

import java.util.Scanner;

class CharInput{
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the character ");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);  //charAt is the method of string
        //sc object is the reference of Scanner class while charAt is the method of string class, you will have to take
        //scanner class method only in between so we took next() to take string input.
        //the char at 0th position is given to next method which will come in reference object and will be stored in variable ch

        System.out.println(ch);
    }
}
