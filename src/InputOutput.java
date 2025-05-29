import java.util.Scanner;

class InputOutput{
    public static void main(String[] args) {
        int a;
        System.out.println("Enter data ");
        Scanner obj=new Scanner(System.in);

        //Now, we can use the object obj with scanner class methods only
        a=obj.nextInt();
        System.out.println("Get data "+a);

    }
}