
//input n>0    +ve number
//input n<0    -ve number
//input =0     neither positive nor negative

import java.util.Scanner;

class PosOrNeg{
    public static void main(String[] args) {
        //Check if number is positive or negative
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n>0) System.out.println("Its a positive number.");
        else if (n<0) {
            System.out.println("Its negative number.");
        }else System.out.println("The number is neither positive nor negative.");
    }
}
