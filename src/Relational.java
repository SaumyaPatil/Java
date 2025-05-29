
// Relational Operators

import java.util.Scanner;

class Relational{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers... ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt(); //Greater
        b = obj.nextInt(); //Lessar
        System.out.println("true/false"+(a<b));
        System.out.println("true/false"+(a>b));
        System.out.println("true/false"+(a>=b));
        System.out.println("true/false"+(a<=b));
        System.out.println("true/false"+(a!=b));
    }
}

