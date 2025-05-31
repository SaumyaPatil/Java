import java.util.Scanner;

class CodeOfDay{
    public static void main(String[] args) {

        int code;
        Scanner sc = new Scanner(System.in);

        code = sc.nextInt();
        switch (code)
        case 0:
            System.out.println("Sunday");
            break;
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Invalid code");
            break;
    }
}
