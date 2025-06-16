import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
        int a;

        //You can only access the methods of scanner class using its object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        a=sc.nextInt();
        System.out.println(a);
    }
}

//This is how you can take input from user at runtime
//You need to import scanner class package to use the class, create its object and use its methods.