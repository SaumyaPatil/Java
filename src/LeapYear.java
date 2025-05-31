import java.util.Scanner;

//century - difference between two leap years is 400 years therefore,
// (100%=0   and   400%=0)      2000  2400
// & yearly (100%!=0 and 4%=0)     2020  2400

class LeapYear{
    public static void main(String[] args) {

        int year;
        System.out.println("Enter year ");
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();
        if ((year%100==0  &&  year%400==0) || (year%100!=0  &&  year%4==0)) System.out.println("This is a leap year.");
        else System.out.println("This is not a leap year.");
    }
}
