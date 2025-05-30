import java.util.Scanner;

class VoteEligibility{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();
        if (age>18) System.out.println("Yes you are eligible to vote.");
        else System.out.println("You are not eligible to vote.");
    }
}
