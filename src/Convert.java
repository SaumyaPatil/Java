
//Convert character from lower to upper case and vice-versa

import java.util.Scanner;

//input a to z    -------> upper-case
//input A to Z    -------> lower-case
class Convert{
    public static void main(String[] args) {

        char ch, ch2;
        System.out.println("Enter any character ");

        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            //int charc = ch+32;
            //System.out.println((char) charc);

            ch2 = Character.toLowerCase(ch);
            System.out.println(ch2);

        }else {
            //int charc = ch-32;
            //System.out.println((char) charc);

            //These are methods of Character class that is inside default lang package in java.
            ch2 = Character.toUpperCase(ch);
            System.out.println(ch2);
        }
    }
}
