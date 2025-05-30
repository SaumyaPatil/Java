import java.util.Scanner;

class ASCIIValue{
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the character for which you want ASCII value ");

        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        //You have to print the ASCII value so, convert to integer
        int a = ch;
        System.out.println(a);


    }
}
