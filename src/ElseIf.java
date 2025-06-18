import java.util.Scanner;

class ElseIf{
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter marks ");

        //sc variable refers to the object of scanner class
        Scanner sc = new Scanner(System.in);

        marks = nextInt();
        if (marks > 80){
            System.out.println("Topper");
        } else if (marks < 80 && marks >= 60){
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}