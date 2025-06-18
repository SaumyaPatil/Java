import java.util.Scanner;

class Arithmetic{
    public static void main(String[] args) {

        int a,b;

        //In runtime you get this message on output screen
        System.out.println("Enter two numbers... ");

        Scanner obj=new Scanner(System.in);

        //Bind the method of scanner class to its object to use it to store value inside the variable.
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Remainder "+(a%b));

    }
}