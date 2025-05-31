import java.util.Scanner;

class PrintNumberOfDaysForMonth{
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Jan 31 days");
                break;
            case 2:
                System.out.println("Feb 28 days");
                break;
            case 3:
                System.out.println("Mar 31 days");
                break;
            case 4:
                System.out.println("April 30 days");
                break;
            case 5:
                System.out.println("May 31 days");
                break;
            case 6:
                System.out.println("June 30 days");
                break;
            case 7:
                System.out.println("July 31 days");
                break;
            case 8:
                System.out.println("August 31 days");
                break;
            case 9:
                System.out.println("Sept 30 days");
                break;
            case 10:
                System.out.println("Oct 31 days");
                break;
            case 11:
                System.out.println("Nov 30 days");
                break;
            case 12:
                System.out.println("December 31 days");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
