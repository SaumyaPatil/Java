import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

class SwapWithoutThirdVariable{
    public static void main(String[] args) {
        int a,b;

        System.out.println("Enter the two numbers ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();  //a=100
        b = sc.nextInt();  //b=200

        a = a+b;     //a=300
        b = a-b;     //b=300-200=100
        a = a-b;     //a=300-100=200

        System.out.println("The values after swapping are " + a + " " + b);
    }
}
