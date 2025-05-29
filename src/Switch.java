import java.util.Scanner;

class Switch{
    public static void main(String[] args) {

        int a=10,b=20, ch;
        System.out.println("Enter user choice ");

        Scanner r = new Scanner(System.in);
        ch = r.nextInt();

        switch (ch){
            case 1:
                System.out.println("Sum " + (a+b));
                break;

            case 2:
                System.out.println("Sub " + (a-b));
                break;

            case 3:
                System.out.println("Multi " + (a*b));
                break;

            case 4:
                System.out.println("Divi " + (a/b));
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}

//You can do the same task using if else if ladder, in that case you will have to give condition for every statement
//Program length increases.
//Here in case of switch, just in one choice its decided which line to be executed and the output will occur in less lines.

